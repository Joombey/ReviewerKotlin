package com.example.reviewerkotlin.data.room.entites

import android.provider.ContactsContract.Contacts.Photo
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.Companion.CASCADE
import androidx.room.ForeignKey.Companion.SET_NULL
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import com.example.reviewerkotlin.domain.models.utils.AuthService
import java.time.LocalDateTime

@Entity(
    tableName = "authors",
    foreignKeys = [
        ForeignKey(
            entity = PermissionEntity::class,
            parentColumns = ["id"],
            childColumns = ["permission_id"],
            onDelete = SET_NULL,
            onUpdate = CASCADE,
            deferred = true
        ),
        ForeignKey(
            entity = PhotoEntity::class,
            parentColumns = ["id"],
            childColumns = ["photo_id"],
            onDelete = CASCADE,
            onUpdate = CASCADE,
            deferred = true
        ),
    ]
)
data class AuthorEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    @ColumnInfo(name = "creation_time")
    val accountCreationDate: LocalDateTime,
    @ColumnInfo(name = "photo_id")
    val photoId: Int,
    @ColumnInfo(name = "permission_id")
    val permissionId: Int,
    @ColumnInfo(name = "auth_service")
    val authService: AuthService
)
