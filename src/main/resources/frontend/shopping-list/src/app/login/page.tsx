'use client'

import { Avatar, Box, Button, Paper, TextField, Typography } from "@mui/material"
import { LockOutlined } from "@mui/icons-material"
import { FormEvent, useState } from "react"

export default function LogIn() {

    const [username, setUsername] = useState("")
    const [password, setPassword] = useState("")

    function login(event: FormEvent) {
        event.preventDefault()
        console.log(username)
        console.log(password)
        fetch("")
    }

    return (
        <Paper elevation={10}
            sx={{
                marginTop: 8,
                padding: 2
            }}>
            <Avatar sx={{
                mx: 'auto',
                bgcolor: 'secondary.main',
                textAlign: "center",
                mb: 1
            }}>
                <LockOutlined />
            </Avatar>
            <Typography component='h1' variant="h5" sx={{ textAlign: "center" }}>
                Sign In
            </Typography>
            <Box component='form' onSubmit={login} noValidate sx={{ mt: 1 }}>
                <TextField
                    type="text"
                    onChange={element => setUsername(element.target.value)}
                    variant="standard"
                    placeholder="Username"
                    sx={{ mb: 2 }}
                    fullWidth
                    required
                    autoFocus
                />
                <TextField
                    type="password"
                    onChange={element => setPassword(element.target.value)}
                    variant="standard"
                    placeholder="Password"
                    sx={{ mb: 2 }}
                    fullWidth
                    required
                />
                <Button
                    type="submit"
                    variant="contained"
                    fullWidth
                    sx={{ mt: 1 }}
                >
                    Sign In
                </Button>
            </Box>
        </Paper>
    )
}