package com.taobao.android.abilityidl.ability;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import tb.kge;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE_USE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.CLASS, AnnotationTarget.TYPE})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: classes4.dex */
public @interface FileError {
    public static final String ALREADY_EXIST = "ALREADY_EXIST";
    public static final a Companion = a.f8679a;
    public static final String DIGEST_COMPUTER_ERROR = "DIGEST_COMPUTER_ERROR";
    public static final String DIR_NOT_EMPTY = "DIR_NOT_EMPTY";
    public static final String DIR_NOT_EXIST = "DIR_NOT_EXIST";
    public static final String FILE_NOT_EXIST = "FILE_NOT_EXIST";
    public static final String ILLEGAL_PATH = "ILLEGAL_PATH";
    public static final String NOT_DIR = "NOT_DIR";
    public static final String NOT_FILE = "NOT_FILE";
    public static final String NOT_ZIP_FILE = "NOT_ZIP_FILE";
    public static final String OUT_OF_SPACE = "OUT_OF_SPACE";
    public static final String SINGLE_FILE_OUT_OF_SPACE = "SINGLE_FILE_OUT_OF_SPACE";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String ALREADY_EXIST = "ALREADY_EXIST";
        public static final String DIGEST_COMPUTER_ERROR = "DIGEST_COMPUTER_ERROR";
        public static final String DIR_NOT_EMPTY = "DIR_NOT_EMPTY";
        public static final String DIR_NOT_EXIST = "DIR_NOT_EXIST";
        public static final String FILE_NOT_EXIST = "FILE_NOT_EXIST";
        public static final String ILLEGAL_PATH = "ILLEGAL_PATH";
        public static final String NOT_DIR = "NOT_DIR";
        public static final String NOT_FILE = "NOT_FILE";
        public static final String NOT_ZIP_FILE = "NOT_ZIP_FILE";
        public static final String OUT_OF_SPACE = "OUT_OF_SPACE";
        public static final String SINGLE_FILE_OUT_OF_SPACE = "SINGLE_FILE_OUT_OF_SPACE";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8679a;

        static {
            kge.a(412479866);
            f8679a = new a();
        }

        private a() {
        }
    }
}
