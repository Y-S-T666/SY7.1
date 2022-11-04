//package com.example.sy7_1;
//
//
//import android.content.ContentProvider;
//import android.content.UriMatcher;
//import android.database.Cursor;
//import android.net.Uri;
//
//public class MyProvider extends ContentProvider {
////    @Override
////    public boolean onCreate(){
////        return false;
////    }
////    @Override
////    public Cursor query(Uri uri, String[] projection, String selection, String[]selectionArgs, String sortOrder){
////        return  null;
////    }
////    @Override
////    public String getType(Uri uri){
////        return null;
////
////    }
//
//    public static final int TABLE1_DIR=0;
//    public static final int TABLE1_ITEM=1;
//    public static final int TABLE2_DIR=2;
//    public static final int TABLE2_ITEM=3;
//
//    private static UriMatcher uriMatcher;
//    static{
//        uriMatcher=new UriMatcher(UriMatcher.NO_MATCH);
//        uriMatcher.addURI("com.example.app.provider","table1",TABLE1_DIR);
//        uriMatcher.addURI("com.example.app.provider","table1/#",TABLE1_ITEM);
//        uriMatcher.addURI("com.example.app.provider","table2",TABLE2_DIR);
//        uriMatcher.addURI("com.example.app.provider","table2/#",TABLE2_ITEM);
//    }
//
//    @Override
//    public Cursor query(Uri uri,String[] projection.String selection,String[] selectionArgs,String sortOrder){
//        switch (uriMatcher.match(uri)){
//            case TABLE1_DIR:
//                break;
//            case TABLE1_ITEM:
//                break;
//            case TABLE2_DIR:
//                break;
//            case TABLE2_ITEM:
//                break;
//            default:
//                break;
//        }
//
//        @Override
//                public String getType(Uri uri){
//            switch (uriMatcher.match(uri)){
//                case TABLE1_DIR:
//                    return "vnd.android.cursor.dir/vnd.com.example.app.provider.table1";
//                case TABLE1_ITEM:
//                    return "vnd.android.cursor.item/vnd.com.example.app.provider.table1";
//                case TABLE2_DIR:
//                    return "vnd.android.cursor.dir/vnd.com.example.app.provider.table2";
//                case TABLE2_ITEM:
//                    return "vnd.android.cursor.item/vnd.com.example.app.provider.table2";
//                default:
//                    break;}
//            return null;
//            }}
