package com.example.pokemon.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/pokemon/database/DatabaseManager;", "", "()V", "database", "Lcom/example/pokemon/database/AppDatabase;", "getDatabase", "()Lcom/example/pokemon/database/AppDatabase;", "setDatabase", "(Lcom/example/pokemon/database/AppDatabase;)V", "createDb", "", "context", "Landroid/content/Context;", "initializableDb", "Companion", "app_debug"})
public final class DatabaseManager {
    public com.example.pokemon.database.AppDatabase database;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.pokemon.database.DatabaseManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.pokemon.database.DatabaseManager instance = null;
    
    public DatabaseManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.pokemon.database.AppDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull()
    com.example.pokemon.database.AppDatabase p0) {
    }
    
    public final void initializableDb(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void createDb(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/pokemon/database/DatabaseManager$Companion;", "", "()V", "instance", "Lcom/example/pokemon/database/DatabaseManager;", "getInstance", "()Lcom/example/pokemon/database/DatabaseManager;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.pokemon.database.DatabaseManager getInstance() {
            return null;
        }
    }
}