import Link from "next/link";

export default function Home() {

  return (
    <div>
      Please log in first
      <Link href="/login">Log In</Link>
    </div>
  );
}
