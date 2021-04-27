package com.eka.roomdatabase;

import java.lang.System;

/**
 * A basic class representing an entity that is a row in a one-column database table.
 *
 * @ Entity - You must annotate the class as an entity and supply a table name if not class name.
 * @ PrimaryKey - You must identify the primary key.
 * @ ColumnInfo - You must supply the column name if it is different from the variable name.
 *
 * See the documentation for the full rich set of annotations.
 * https://developer.android.com/topic/libraries/architecture/room.html
 */
@androidx.room.Entity(tableName = "word_table")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/eka/roomdatabase/Word;", "", "word", "", "(Ljava/lang/String;)V", "getWord", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Word {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "word")
    @androidx.room.PrimaryKey()
    private final java.lang.String word = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWord() {
        return null;
    }
    
    public Word(@org.jetbrains.annotations.NotNull()
    java.lang.String word) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * A basic class representing an entity that is a row in a one-column database table.
     *
     * @ Entity - You must annotate the class as an entity and supply a table name if not class name.
     * @ PrimaryKey - You must identify the primary key.
     * @ ColumnInfo - You must supply the column name if it is different from the variable name.
     *
     * See the documentation for the full rich set of annotations.
     * https://developer.android.com/topic/libraries/architecture/room.html
     */
    @org.jetbrains.annotations.NotNull()
    public final com.eka.roomdatabase.Word copy(@org.jetbrains.annotations.NotNull()
    java.lang.String word) {
        return null;
    }
    
    /**
     * A basic class representing an entity that is a row in a one-column database table.
     *
     * @ Entity - You must annotate the class as an entity and supply a table name if not class name.
     * @ PrimaryKey - You must identify the primary key.
     * @ ColumnInfo - You must supply the column name if it is different from the variable name.
     *
     * See the documentation for the full rich set of annotations.
     * https://developer.android.com/topic/libraries/architecture/room.html
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * A basic class representing an entity that is a row in a one-column database table.
     *
     * @ Entity - You must annotate the class as an entity and supply a table name if not class name.
     * @ PrimaryKey - You must identify the primary key.
     * @ ColumnInfo - You must supply the column name if it is different from the variable name.
     *
     * See the documentation for the full rich set of annotations.
     * https://developer.android.com/topic/libraries/architecture/room.html
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A basic class representing an entity that is a row in a one-column database table.
     *
     * @ Entity - You must annotate the class as an entity and supply a table name if not class name.
     * @ PrimaryKey - You must identify the primary key.
     * @ ColumnInfo - You must supply the column name if it is different from the variable name.
     *
     * See the documentation for the full rich set of annotations.
     * https://developer.android.com/topic/libraries/architecture/room.html
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}