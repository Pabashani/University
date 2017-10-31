package com.example.android.university.dbHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int
            version) {
        super(context, name, factory, version);
    }


    // Logcat tag
    private static final String LOG = "DatabaseHelper";

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "university";

    // Table Names
    private static final String TABLE_STUDENT= "student";
    private static final String TABLE_LECTURER = "lecturer";
    private static final String TABLE_COURSE = "course";
    private static final String TABLE_ADMINISTRATOR= "administrator";
    private static final String TABLE_DEPARTMENT = "department";


    // TABLE_STUDENT "student" Table - column names
    private static final String KEY_STD_ID = "std_id";
    private static final String KEY_STD_NAME = "std_name";
    private static final String KEY_STD_ACC_PASSWORD = "std_password";
    private static final String KEY_YEAR = "std_year";

    // TABLE_LECTURER = "lecturer" Table - column names
    private static final String KEY_LEC_ID = "lec_id";
    private static final String KEY_LEC_NAME = "lec_name";
    private static final String KEY_LEC_ACC_PASSWORD = "lec_password";
    private static final String KEY_DEP = "dep_name";

    // TABLE_COURSE = "course" Table - column names
    private static final String KEY_COURSE_ID = "course_id";
    private static final String KEY_COURSE_NAME = "course_name";

    // TABLE_DEPARTMENT = "department" Table - column names
    private static final String KEY_DEP_ID = "dep_id";
    private static final String KEY_DEP_NAME = "dep_name";

    //TABLE_ADMINISTRATOR= "administrator" Table - column names
    private static final String KEY_ADMIN_ID = "admin_id";
    private static final String KEY_ADMIN_NAME = "admin_name";
    private static final String KEY_ADMIN_ACC_PASSWORD = "admin_password";

    // Table Create Statements
    // CREATE_TABLE_STUDENT create statement
    private static final String CREATE_TABLE_STUDENT = "CREATE TABLE "
            + TABLE_STUDENT + "(" + KEY_STD_ID + " TEXT PRIMARY KEY," + KEY_STD_NAME
            + " TEXT," + KEY_STD_ACC_PASSWORD + " TEXT," + KEY_YEAR
            + " INTEGER" + ")";

    // CREATE_TABLE_LECTURER create statement
    private static final String CREATE_TABLE_LECTURER = "CREATE TABLE " + TABLE_LECTURER
            + "(" + KEY_LEC_ID + " TEXT PRIMARY KEY," + KEY_LEC_NAME + " TEXT,"
            + KEY_LEC_ACC_PASSWORD + " TEXT," + KEY_DEP+ "TEXT" +")";

    // CREATE_TABLE_ADMINISTRATOR create statement
    private static final String CREATE_TABLE_ADMINISTRATOR = "CREATE TABLE "
            + TABLE_ADMINISTRATOR + "(" + KEY_ADMIN_ID + " TEXT PRIMARY KEY,"
            + KEY_ADMIN_NAME + " TEXT " + KEY_ADMIN_ACC_PASSWORD + " TEXT "+")";

    // CREATE_TABLE_COURSE create statement
    private static final String CREATE_TABLE_COURSE = "CREATE TABLE "
            + TABLE_ADMINISTRATOR + "(" + KEY_COURSE_ID + " TEXT PRIMARY KEY,"
            + KEY_COURSE_NAME + " TEXT "+")";

    // CREATE_TABLE_DEPARTMENT create statement
    private static final String CREATE_TABLE_DEPARTMENT  = "CREATE TABLE "
            + TABLE_DEPARTMENT  + "(" + KEY_DEP_ID + " TEXT PRIMARY KEY,"
            + KEY_DEP_NAME + " TEXT "+")";



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        // creating required tables
        sqLiteDatabase.execSQL(CREATE_TABLE_STUDENT);
        sqLiteDatabase.execSQL(CREATE_TABLE_LECTURER);
        sqLiteDatabase.execSQL(CREATE_TABLE_COURSE);
        sqLiteDatabase.execSQL(CREATE_TABLE_ADMINISTRATOR);
        sqLiteDatabase.execSQL(CREATE_TABLE_DEPARTMENT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENT);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_LECTURER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ADMINISTRATOR);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COURSE);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DEPARTMENT);
        // create new tables
        onCreate(db);
    }
}
