package dev.lchang.appdpa.data.remote

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.storage.Storage

object SupabaseManager {

    private const val SUPABASE_URL = "https://tthgdqvcllxqspwwcyeh.supabase.co"
    private const val SUPABASE_ANON_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InR0aGdkcXZjbGx4cXNwd3djeWVoIiwicm9sZSI6ImFub24iLCJpYXQiOjE3OTIyNzUzMzYsImV4cCI6MjEwNzg1MTMzNn0.xDbvCNDfqZuI4g0LHQOBcP5VFqYrxxc4NGBNI75w2JQ"

    val client = createSupabaseClient(
                SUPABASE_URL,
        SUPABASE_ANON_KEY){
        install(Storage)
    }
}