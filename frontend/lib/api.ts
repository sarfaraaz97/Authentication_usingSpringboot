import type { User } from "@/types/user"

const API_URL = process.env.NEXT_PUBLIC_API_URL || ""

export async function registerUser(userData: User): Promise<User> {
  const response = await fetch(`${API_URL}/register`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(userData),
  })

  if (!response.ok) {
    throw new Error("Failed to register user")
  }

  return response.json()
}

export async function fetchProtectedData(): Promise<any> {
  const token = localStorage.getItem("jwt_token")

  if (!token) {
    throw new Error("No authentication token found")
  }

  const response = await fetch(`${API_URL}/protected-endpoint`, {
    headers: {
      Authorization: `Bearer ${token}`,
    },
  })

  if (!response.ok) {
    throw new Error("Failed to fetch protected data")
  }

  return response.json()
}

