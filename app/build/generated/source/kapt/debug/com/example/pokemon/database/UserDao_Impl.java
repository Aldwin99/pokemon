package com.example.pokemon.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserEntity> __insertionAdapterOfUserEntity;

  private final EntityDeletionOrUpdateAdapter<UserEntity> __deletionAdapterOfUserEntity;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserEntity = new EntityInsertionAdapter<UserEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user` (`id`,`name`,`tipo`,`hp`,`attack`,`special`,`defense`,`defense_special`,`speed`,`weight`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getTipo() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTipo());
        }
        if (value.getHp() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getHp());
        }
        if (value.getAttack() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAttack());
        }
        if (value.getSpecial() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSpecial());
        }
        if (value.getDefense() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDefense());
        }
        if (value.getDefense_special() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getDefense_special());
        }
        if (value.getSpeed() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getSpeed());
        }
        if (value.getWeight() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getWeight());
        }
      }
    };
    this.__deletionAdapterOfUserEntity = new EntityDeletionOrUpdateAdapter<UserEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `user` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void save(final UserEntity user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserEntity.insert(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final UserEntity user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfUserEntity.handle(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<UserEntity> getUsersFromDatabase() {
    final String _sql = "SELECT * FROM user";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfTipo = CursorUtil.getColumnIndexOrThrow(_cursor, "tipo");
      final int _cursorIndexOfHp = CursorUtil.getColumnIndexOrThrow(_cursor, "hp");
      final int _cursorIndexOfAttack = CursorUtil.getColumnIndexOrThrow(_cursor, "attack");
      final int _cursorIndexOfSpecial = CursorUtil.getColumnIndexOrThrow(_cursor, "special");
      final int _cursorIndexOfDefense = CursorUtil.getColumnIndexOrThrow(_cursor, "defense");
      final int _cursorIndexOfDefenseSpecial = CursorUtil.getColumnIndexOrThrow(_cursor, "defense_special");
      final int _cursorIndexOfSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "speed");
      final int _cursorIndexOfWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "weight");
      final List<UserEntity> _result = new ArrayList<UserEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final UserEntity _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpTipo;
        if (_cursor.isNull(_cursorIndexOfTipo)) {
          _tmpTipo = null;
        } else {
          _tmpTipo = _cursor.getString(_cursorIndexOfTipo);
        }
        final String _tmpHp;
        if (_cursor.isNull(_cursorIndexOfHp)) {
          _tmpHp = null;
        } else {
          _tmpHp = _cursor.getString(_cursorIndexOfHp);
        }
        final String _tmpAttack;
        if (_cursor.isNull(_cursorIndexOfAttack)) {
          _tmpAttack = null;
        } else {
          _tmpAttack = _cursor.getString(_cursorIndexOfAttack);
        }
        final String _tmpSpecial;
        if (_cursor.isNull(_cursorIndexOfSpecial)) {
          _tmpSpecial = null;
        } else {
          _tmpSpecial = _cursor.getString(_cursorIndexOfSpecial);
        }
        final String _tmpDefense;
        if (_cursor.isNull(_cursorIndexOfDefense)) {
          _tmpDefense = null;
        } else {
          _tmpDefense = _cursor.getString(_cursorIndexOfDefense);
        }
        final String _tmpDefense_special;
        if (_cursor.isNull(_cursorIndexOfDefenseSpecial)) {
          _tmpDefense_special = null;
        } else {
          _tmpDefense_special = _cursor.getString(_cursorIndexOfDefenseSpecial);
        }
        final String _tmpSpeed;
        if (_cursor.isNull(_cursorIndexOfSpeed)) {
          _tmpSpeed = null;
        } else {
          _tmpSpeed = _cursor.getString(_cursorIndexOfSpeed);
        }
        final String _tmpWeight;
        if (_cursor.isNull(_cursorIndexOfWeight)) {
          _tmpWeight = null;
        } else {
          _tmpWeight = _cursor.getString(_cursorIndexOfWeight);
        }
        _item = new UserEntity(_tmpId,_tmpName,_tmpTipo,_tmpHp,_tmpAttack,_tmpSpecial,_tmpDefense,_tmpDefense_special,_tmpSpeed,_tmpWeight);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
