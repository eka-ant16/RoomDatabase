package com.eka.roomdatabase;

import java.lang.System;

/**
 * This is the backend. The database. This used to be done by the OpenHelper.
 * The fact that this has very few comments emphasizes its coolness.
 */
@androidx.room.Database(entities = {com.eka.roomdatabase.Word.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lcom/eka/roomdatabase/WordRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "wordDao", "Lcom/eka/roomdatabase/WordDao;", "Companion", "app_debug"})
public abstract class WordRoomDatabase extends androidx.room.RoomDatabase {
    private static volatile com.eka.roomdatabase.WordRoomDatabase INSTANCE;
    public static final com.eka.roomdatabase.WordRoomDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.eka.roomdatabase.WordDao wordDao();
    
    public WordRoomDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/eka/roomdatabase/WordRoomDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/eka/roomdatabase/WordRoomDatabase;", "getDatabase", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "populateDatabase", "", "wordDao", "Lcom/eka/roomdatabase/WordDao;", "(Lcom/eka/roomdatabase/WordDao;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WordDatabaseCallback", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.eka.roomdatabase.WordRoomDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope scope) {
            return null;
        }
        
        /**
         * Populate the database in a new coroutine.
         * If you want to start with more words, just add them.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object populateDatabase(@org.jetbrains.annotations.NotNull()
        com.eka.roomdatabase.WordDao wordDao, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
            return null;
        }
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/eka/roomdatabase/WordRoomDatabase$Companion$WordDatabaseCallback;", "Landroidx/room/RoomDatabase$Callback;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "app_debug"})
        static final class WordDatabaseCallback extends androidx.room.RoomDatabase.Callback {
            private final kotlinx.coroutines.CoroutineScope scope = null;
            
            /**
             * Override the onCreate method to populate the database.
             */
            @java.lang.Override()
            public void onCreate(@org.jetbrains.annotations.NotNull()
            androidx.sqlite.db.SupportSQLiteDatabase db) {
            }
            
            public WordDatabaseCallback(@org.jetbrains.annotations.NotNull()
            kotlinx.coroutines.CoroutineScope scope) {
                super();
            }
        }
    }
}