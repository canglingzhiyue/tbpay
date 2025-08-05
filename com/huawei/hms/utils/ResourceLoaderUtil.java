package com.huawei.hms.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.taobao.share.ui.engine.friend.a;

/* loaded from: classes4.dex */
public abstract class ResourceLoaderUtil {

    /* renamed from: a  reason: collision with root package name */
    private static Context f7594a;
    private static String b;

    public static int getAnimId(String str) {
        return f7594a.getResources().getIdentifier(str, "anim", b);
    }

    public static int getColorId(String str) {
        return f7594a.getResources().getIdentifier(str, "color", b);
    }

    public static int getDimenId(String str) {
        return f7594a.getResources().getIdentifier(str, "dimen", b);
    }

    public static Drawable getDrawable(String str) {
        return f7594a.getResources().getDrawable(getDrawableId(str));
    }

    public static int getDrawableId(String str) {
        return f7594a.getResources().getIdentifier(str, a.CONTACTS_INFO_NOT_EMPTY_STATUS, b);
    }

    public static int getIdId(String str) {
        return f7594a.getResources().getIdentifier(str, "id", b);
    }

    public static int getLayoutId(String str) {
        return f7594a.getResources().getIdentifier(str, "layout", b);
    }

    public static String getString(String str) {
        return f7594a.getResources().getString(getStringId(str));
    }

    public static String getString(String str, Object... objArr) {
        return f7594a.getResources().getString(getStringId(str), objArr);
    }

    public static int getStringId(String str) {
        return f7594a.getResources().getIdentifier(str, "string", b);
    }

    public static int getStyleId(String str) {
        return f7594a.getResources().getIdentifier(str, "style", b);
    }

    public static Context getmContext() {
        return f7594a;
    }

    public static void setmContext(Context context) {
        f7594a = context;
        b = context.getPackageName();
    }
}
