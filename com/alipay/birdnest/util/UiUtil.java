package com.alipay.birdnest.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.IBinder;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.alipay.android.app.template.KeyboardType;
import com.alipay.android.app.template.TemplateKeyboardService;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocumentAssistor;
import com.taobao.android.weex_framework.util.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class UiUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INPUT_TYPE_VALUE_CHECKBOX = "checkbox";
    public static final String INPUT_TYPE_VALUE_EXTERNAL = "external";
    public static final String INPUT_TYPE_VALUE_EXTERNALALPHABET = "externalalphabet";
    public static final String INPUT_TYPE_VALUE_EXTERNALNUMBER = "externalnumber";
    public static final String INPUT_TYPE_VALUE_IDCARD = "idcard";
    public static final String INPUT_TYPE_VALUE_MONEY = "money";
    public static final String INPUT_TYPE_VALUE_MONEYNOTOP = "moneynotop";
    public static final String INPUT_TYPE_VALUE_MONTH = "month";
    public static final String INPUT_TYPE_VALUE_NUM = "num";
    public static final String INPUT_TYPE_VALUE_NUMBER = "number";
    public static final String INPUT_TYPE_VALUE_PASSWORD = "password";
    public static final String INPUT_TYPE_VALUE_PAYPWD = "paypwd";
    public static final String INPUT_TYPE_VALUE_PAYSPWD = "payspwd";
    public static final String INPUT_TYPE_VALUE_PHONE = "phone";
    public static final String INPUT_TYPE_VALUE_STYLENONE = "stylenone";
    public static final String INPUT_TYPE_VALUE_STYLENONEPAD = "stylenonepad";
    public static final String INPUT_TYPE_VALUE_STYLEPHONE = "stylephone";
    public static final String INPUT_TYPE_VALUE_STYLEPHONEPAD = "stylephonepad";
    public static final String INPUT_TYPE_VALUE_STYLEPOINT = "stylepoint";
    public static final String INPUT_TYPE_VALUE_STYLEPOINTPAD = "stylepointpad";
    public static final String INPUT_TYPE_VALUE_STYLEX = "stylex";
    public static final String INPUT_TYPE_VALUE_STYLEXPAD = "stylexpad";
    public static final String INPUT_TYPE_VALUE_TINYAPPNUMBER = "tinyappnumber";

    public static Bitmap blur(Bitmap bitmap, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b3fd28cf", new Object[]{bitmap, view, new Integer(i)});
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(1.0f, 1.0f);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return doBlur(createBitmap, i, true);
    }

    public static void disableSystemSoftInput(EditText editText) {
        if (Build.VERSION.SDK_INT > 10) {
            try {
                editText.setShowSoftInputOnFocus(false);
            } catch (Exception e) {
                FBLogger.e("disableSystemSoftInput case 1", e);
            }
            try {
                Method method = EditText.class.getMethod("setSoftInputShownOnFocus", Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(editText, Boolean.FALSE);
            } catch (Exception e2) {
                FBLogger.e("disableSystemSoftInput case 2", e2);
            }
        }
    }

    public static Bitmap doBlur(Bitmap bitmap, int i, boolean z) {
        int[] iArr;
        Bitmap bitmap2 = bitmap;
        int i2 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("83631d04", new Object[]{bitmap2, new Integer(i2), new Boolean(z)});
        }
        if (!z) {
            bitmap2 = bitmap2.copy(bitmap.getConfig(), true);
        }
        if (i2 <= 0) {
            return null;
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        bitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i7 = (i6 + 1) >> 1;
        int i8 = i7 * i7;
        int i9 = i8 << 8;
        int[] iArr7 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr7[i10] = i10 / i8;
        }
        int[][] iArr8 = (int[][]) Array.newInstance(int.class, i6, 3);
        int i11 = i2 + 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < height) {
            Bitmap bitmap3 = bitmap2;
            int i15 = -i2;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            while (i15 <= i2) {
                int i25 = height;
                int i26 = i5;
                int i27 = iArr2[Math.min(i4, Math.max(i15, 0)) + i13];
                int[] iArr9 = iArr8[i15 + i2];
                int i28 = i13;
                iArr9[0] = (i27 >> 16) & 255;
                iArr9[1] = (i27 >> 8) & 255;
                iArr9[2] = i27 & 255;
                int abs = i11 - Math.abs(i15);
                i18 += iArr9[0] * abs;
                i17 += iArr9[1] * abs;
                i16 += iArr9[2] * abs;
                if (i15 > 0) {
                    i24 += iArr9[0];
                    i23 += iArr9[1];
                    i22 += iArr9[2];
                } else {
                    i21 += iArr9[0];
                    i20 += iArr9[1];
                    i19 += iArr9[2];
                }
                i15++;
                height = i25;
                i5 = i26;
                i13 = i28;
            }
            int i29 = height;
            int i30 = i5;
            int i31 = i2;
            int i32 = 0;
            while (i32 < width) {
                iArr3[i13] = iArr7[i18];
                iArr4[i13] = iArr7[i17];
                iArr5[i13] = iArr7[i16];
                int i33 = i18 - i21;
                int i34 = i17 - i20;
                int i35 = i16 - i19;
                int[] iArr10 = iArr8[((i31 - i2) + i6) % i6];
                int i36 = i21 - iArr10[0];
                int i37 = i20 - iArr10[1];
                int i38 = i19 - iArr10[2];
                if (i12 == 0) {
                    iArr = iArr7;
                    iArr6[i32] = Math.min(i32 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i39 = iArr2[i14 + iArr6[i32]];
                iArr10[0] = (i39 >> 16) & 255;
                iArr10[1] = (i39 >> 8) & 255;
                iArr10[2] = i39 & 255;
                int i40 = i24 + iArr10[0];
                int i41 = i23 + iArr10[1];
                int i42 = i22 + iArr10[2];
                i18 = i33 + i40;
                i17 = i34 + i41;
                i16 = i35 + i42;
                i31 = (i31 + 1) % i6;
                int[] iArr11 = iArr8[i31 % i6];
                i21 = i36 + iArr11[0];
                i20 = i37 + iArr11[1];
                i19 = i38 + iArr11[2];
                i24 = i40 - iArr11[0];
                i23 = i41 - iArr11[1];
                i22 = i42 - iArr11[2];
                i13++;
                i32++;
                i4 = i4;
                iArr7 = iArr;
            }
            i14 += width;
            i12++;
            bitmap2 = bitmap3;
            height = i29;
            i5 = i30;
        }
        Bitmap bitmap4 = bitmap2;
        int i43 = height;
        int[] iArr12 = iArr7;
        int i44 = i5;
        int i45 = 0;
        while (i45 < width) {
            int i46 = -i2;
            int i47 = i46 * width;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            while (i46 <= i2) {
                int[] iArr13 = iArr6;
                int max = Math.max(0, i47) + i45;
                int[] iArr14 = iArr8[i46 + i2];
                iArr14[0] = iArr3[max];
                iArr14[1] = iArr4[max];
                iArr14[2] = iArr5[max];
                int abs2 = i11 - Math.abs(i46);
                i50 += iArr3[max] * abs2;
                i49 += iArr4[max] * abs2;
                i48 += iArr5[max] * abs2;
                if (i46 > 0) {
                    i56 += iArr14[0];
                    i55 += iArr14[1];
                    i54 += iArr14[2];
                } else {
                    i53 += iArr14[0];
                    i52 += iArr14[1];
                    i51 += iArr14[2];
                }
                int i57 = i44;
                if (i46 < i57) {
                    i47 += width;
                }
                i46++;
                i44 = i57;
                iArr6 = iArr13;
            }
            int[] iArr15 = iArr6;
            int i58 = i44;
            int i59 = i43;
            int i60 = i49;
            int i61 = i55;
            int i62 = i56;
            int i63 = i45;
            int i64 = i2;
            int i65 = i54;
            int i66 = i53;
            int i67 = i50;
            int i68 = i48;
            int i69 = 0;
            while (i69 < i59) {
                iArr2[i63] = (iArr2[i63] & (-16777216)) | (iArr12[i67] << 16) | (iArr12[i60] << 8) | iArr12[i68];
                int i70 = i67 - i66;
                int i71 = i60 - i52;
                int i72 = i68 - i51;
                int[] iArr16 = iArr8[((i64 - i2) + i6) % i6];
                int i73 = i66 - iArr16[0];
                int i74 = i52 - iArr16[1];
                int i75 = i51 - iArr16[2];
                if (i45 == 0) {
                    iArr15[i69] = Math.min(i69 + i11, i58) * width;
                }
                int i76 = iArr15[i69] + i45;
                iArr16[0] = iArr3[i76];
                iArr16[1] = iArr4[i76];
                iArr16[2] = iArr5[i76];
                int i77 = i62 + iArr16[0];
                int i78 = i61 + iArr16[1];
                int i79 = i65 + iArr16[2];
                i67 = i70 + i77;
                i60 = i71 + i78;
                i68 = i72 + i79;
                i64 = (i64 + 1) % i6;
                int[] iArr17 = iArr8[i64];
                i66 = i73 + iArr17[0];
                i52 = i74 + iArr17[1];
                i51 = i75 + iArr17[2];
                i62 = i77 - iArr17[0];
                i61 = i78 - iArr17[1];
                i65 = i79 - iArr17[2];
                i63 += width;
                i69++;
                i2 = i;
            }
            i45++;
            i2 = i;
            i43 = i59;
            i44 = i58;
            iArr6 = iArr15;
        }
        bitmap4.setPixels(iArr2, 0, width, 0, 0, width, i43);
        return bitmap4;
    }

    public static StateListDrawable genButtonSelector(Context context, String str, int i, int i2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StateListDrawable) ipChange.ipc$dispatch("9fbb7726", new Object[]{context, str, new Integer(i), new Integer(i2), strArr});
        }
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        boolean z = true;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            String str2 = strArr[i3];
            if (!StringUtils.isEmpty(str2)) {
                Drawable localDrawable = getLocalDrawable(str2, context, i, i2);
                boolean z2 = StringUtils.equals(str, INPUT_TYPE_VALUE_CHECKBOX) || StringUtils.equals(str, "radio");
                int i4 = z2 ? 16842912 : 16842919;
                if (i3 == 0) {
                    if (z2) {
                        stateListDrawable.addState(new int[]{-i4}, localDrawable);
                    } else {
                        stateListDrawable.addState(new int[]{16842910, -i4, -16842908}, localDrawable);
                    }
                } else if (i3 == 1) {
                    if (z2) {
                        stateListDrawable.addState(new int[]{i4}, localDrawable);
                    } else {
                        stateListDrawable.addState(new int[]{16842910, i4}, localDrawable);
                        stateListDrawable.addState(new int[]{16842910, 16842908}, localDrawable);
                    }
                } else if (i3 == 2 && !z2) {
                    stateListDrawable.addState(new int[]{-16842910}, localDrawable);
                }
                z = false;
            }
        }
        if (!z) {
            return stateListDrawable;
        }
        return null;
    }

    public static TemplateKeyboardService genDefaultKeyboardService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateKeyboardService) ipChange.ipc$dispatch("592aaa51", new Object[0]) : new TemplateKeyboardService() { // from class: com.alipay.birdnest.util.UiUtil.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public boolean f5274a = false;

            @Override // com.alipay.android.app.template.TemplateKeyboardService
            public void destroyKeyboard(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ceb8b1ca", new Object[]{this, view});
                }
            }

            @Override // com.alipay.android.app.template.TemplateKeyboardService
            public boolean hideKeyboard(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("cc85cb86", new Object[]{this, view})).booleanValue();
                }
                UiUtil.hideKeybroad(view.getWindowToken(), view.getContext());
                boolean z = this.f5274a;
                this.f5274a = false;
                return z;
            }

            @Override // com.alipay.android.app.template.TemplateKeyboardService
            public boolean showKeyboard(EditText editText, KeyboardType keyboardType, View view, View view2, boolean z, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("9bce61c5", new Object[]{this, editText, keyboardType, view, view2, new Boolean(z), new Integer(i)})).booleanValue();
                }
                UiUtil.showKeybroad(editText, i);
                this.f5274a = true;
                return true;
            }
        };
    }

    public static KeyboardType getKeyboardType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KeyboardType) ipChange.ipc$dispatch("a43b290c", new Object[]{str});
        }
        if (str == null) {
            str = "";
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2044506306:
                if (str.equals(INPUT_TYPE_VALUE_EXTERNALALPHABET)) {
                    c = 0;
                    break;
                }
                break;
            case -1820761141:
                if (str.equals(INPUT_TYPE_VALUE_EXTERNAL)) {
                    c = 1;
                    break;
                }
                break;
            case -1555781836:
                if (str.equals(INPUT_TYPE_VALUE_MONEYNOTOP)) {
                    c = 2;
                    break;
                }
                break;
            case -1422422604:
                if (str.equals(INPUT_TYPE_VALUE_STYLEPOINTPAD)) {
                    c = 3;
                    break;
                }
                break;
            case -1193508181:
                if (str.equals(INPUT_TYPE_VALUE_IDCARD)) {
                    c = 4;
                    break;
                }
                break;
            case -1034364087:
                if (str.equals("number")) {
                    c = 5;
                    break;
                }
                break;
            case -891774745:
                if (str.equals(INPUT_TYPE_VALUE_STYLEX)) {
                    c = 6;
                    break;
                }
                break;
            case -786491758:
                if (str.equals(INPUT_TYPE_VALUE_PAYSPWD)) {
                    c = 7;
                    break;
                }
                break;
            case 109446:
                if (str.equals(INPUT_TYPE_VALUE_NUM)) {
                    c = '\b';
                    break;
                }
                break;
            case 104079552:
                if (str.equals(INPUT_TYPE_VALUE_MONEY)) {
                    c = '\t';
                    break;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c = '\n';
                    break;
                }
                break;
            case 155453021:
                if (str.equals(INPUT_TYPE_VALUE_STYLEPHONE)) {
                    c = 11;
                    break;
                }
                break;
            case 155655807:
                if (str.equals(INPUT_TYPE_VALUE_STYLEPOINT)) {
                    c = '\f';
                    break;
                }
                break;
            case 311229140:
                if (str.equals(INPUT_TYPE_VALUE_EXTERNALNUMBER)) {
                    c = '\r';
                    break;
                }
                break;
            case 867927466:
                if (str.equals(INPUT_TYPE_VALUE_TINYAPPNUMBER)) {
                    c = 14;
                    break;
                }
                break;
            case 1126314262:
                if (str.equals(INPUT_TYPE_VALUE_STYLEPHONEPAD)) {
                    c = 15;
                    break;
                }
                break;
            case 1785683850:
                if (str.equals(INPUT_TYPE_VALUE_STYLENONEPAD)) {
                    c = 16;
                    break;
                }
                break;
            case 1806077033:
                if (str.equals(INPUT_TYPE_VALUE_STYLENONE)) {
                    c = 17;
                    break;
                }
                break;
            case 1806375500:
                if (str.equals(INPUT_TYPE_VALUE_STYLEXPAD)) {
                    c = 18;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return KeyboardType.customalphabet;
            case 1:
                return KeyboardType.custom;
            case 2:
                return KeyboardType.moneynotop;
            case 3:
                return KeyboardType.stylepointpad;
            case 4:
                return KeyboardType.idcard;
            case 5:
            case 7:
            case '\b':
                return KeyboardType.num;
            case 6:
                return KeyboardType.stylex;
            case '\t':
                return KeyboardType.money;
            case '\n':
                return KeyboardType.phone;
            case 11:
                return KeyboardType.stylephone;
            case '\f':
                return KeyboardType.stylepoint;
            case '\r':
                return KeyboardType.customnumber;
            case 14:
                return KeyboardType.tinyappnumber;
            case 15:
                return KeyboardType.stylephonepad;
            case 16:
                return KeyboardType.stylenonepad;
            case 17:
                return KeyboardType.stylenone;
            case 18:
                return KeyboardType.stylexpad;
            default:
                return KeyboardType.text;
        }
    }

    public static Drawable getLocalDrawable(String str, Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("618bd756", new Object[]{str, context, new Integer(i), new Integer(i2)}) : getLocalDrawable(str, context, i, i2, false);
    }

    public static Drawable getPaddingDrawable(int i, int i2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("2d52a2f2", new Object[]{new Integer(i), new Integer(i2), context});
        }
        if (context != null) {
            Resources resources = context.getResources();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDensity = 320;
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, i2, options);
            Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth() + ((int) (FBDocumentAssistor.getDp() * 6.0f)), decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Rect rect = new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight());
            canvas.drawBitmap(decodeResource, rect, rect, (Paint) null);
            return new BitmapDrawable(resources, createBitmap);
        }
        throw new IllegalArgumentException("Invalid context");
    }

    public static void hideKeybroad(IBinder iBinder, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f197c5d5", new Object[]{iBinder, context});
        } else {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(iBinder, 2);
        }
    }

    public static boolean isGTP8600() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47e931a2", new Object[0])).booleanValue() : Build.MANUFACTURER.toLowerCase().equals("samsung") && "gt-p6800".equals(Build.MODEL.toLowerCase());
    }

    public static boolean isOppoDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("815a0b6b", new Object[0])).booleanValue();
        }
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        return lowerCase.equals("oppo") || lowerCase.equals(DeviceProperty.ALIAS_ONEPLUS) || lowerCase.equals("tcl");
    }

    public static boolean isUseDefaultKeyboard(String str, String str2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7275eaa", new Object[]{str, str2})).booleanValue();
        }
        if (str == null) {
            str = "";
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2044506306:
                if (str.equals(INPUT_TYPE_VALUE_EXTERNALALPHABET)) {
                    c = 0;
                    break;
                }
                break;
            case -1820761141:
                if (str.equals(INPUT_TYPE_VALUE_EXTERNAL)) {
                    c = 1;
                    break;
                }
                break;
            case -1555781836:
                if (str.equals(INPUT_TYPE_VALUE_MONEYNOTOP)) {
                    c = 2;
                    break;
                }
                break;
            case -1422422604:
                if (str.equals(INPUT_TYPE_VALUE_STYLEPOINTPAD)) {
                    c = 3;
                    break;
                }
                break;
            case -1193508181:
                if (str.equals(INPUT_TYPE_VALUE_IDCARD)) {
                    c = 4;
                    break;
                }
                break;
            case -995204715:
                if (str.equals(INPUT_TYPE_VALUE_PAYPWD)) {
                    c = 5;
                    break;
                }
                break;
            case -891774745:
                if (str.equals(INPUT_TYPE_VALUE_STYLEX)) {
                    c = 6;
                    break;
                }
                break;
            case -786491758:
                if (str.equals(INPUT_TYPE_VALUE_PAYSPWD)) {
                    c = 7;
                    break;
                }
                break;
            case 104079552:
                if (str.equals(INPUT_TYPE_VALUE_MONEY)) {
                    c = '\b';
                    break;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c = '\t';
                    break;
                }
                break;
            case 155453021:
                if (str.equals(INPUT_TYPE_VALUE_STYLEPHONE)) {
                    c = '\n';
                    break;
                }
                break;
            case 155655807:
                if (str.equals(INPUT_TYPE_VALUE_STYLEPOINT)) {
                    c = 11;
                    break;
                }
                break;
            case 311229140:
                if (str.equals(INPUT_TYPE_VALUE_EXTERNALNUMBER)) {
                    c = '\f';
                    break;
                }
                break;
            case 867927466:
                if (str.equals(INPUT_TYPE_VALUE_TINYAPPNUMBER)) {
                    c = '\r';
                    break;
                }
                break;
            case 1126314262:
                if (str.equals(INPUT_TYPE_VALUE_STYLEPHONEPAD)) {
                    c = 14;
                    break;
                }
                break;
            case 1785683850:
                if (str.equals(INPUT_TYPE_VALUE_STYLENONEPAD)) {
                    c = 15;
                    break;
                }
                break;
            case 1806077033:
                if (str.equals(INPUT_TYPE_VALUE_STYLENONE)) {
                    c = 16;
                    break;
                }
                break;
            case 1806375500:
                if (str.equals(INPUT_TYPE_VALUE_STYLEXPAD)) {
                    c = 17;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
                z = false;
                break;
            default:
                z = true;
                break;
        }
        return z && !StringUtils.equals(str2, a.ATOM_EXT_safe);
    }

    public static String readAssetsFile(String str, AssetManager assetManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abe77c6d", new Object[]{str, assetManager});
        }
        StringBuilder sb = new StringBuilder();
        try {
            InputStream open = assetManager.open(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
            char[] cArr = new char[2048];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read <= 0) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
            bufferedReader.close();
            if (open != null) {
                try {
                    open.close();
                } catch (IOException e) {
                    FBLogger.e("readAssetsFile", e);
                }
            }
        } catch (IOException e2) {
            FBLogger.e("readAssetsFile", e2);
        }
        return sb.toString();
    }

    public static void setAlpha(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b035a251", new Object[]{view, new Float(f)});
        } else if (Build.VERSION.SDK_INT < 11) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(f, f);
            alphaAnimation.setDuration(0L);
            alphaAnimation.setFillAfter(true);
            view.startAnimation(alphaAnimation);
        } else {
            view.setAlpha(f);
        }
    }

    public static void showKeybroad(final EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b50f0b", new Object[]{editText, new Integer(i)});
        } else if (editText == null) {
        } else {
            editText.postDelayed(new Runnable() { // from class: com.alipay.birdnest.util.UiUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 0);
                    } catch (Throwable th) {
                        FBLogger.e("UiUtil", th);
                    }
                }
            }, i);
        }
    }

    public static Bitmap toGrayscale(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d06b6459", new Object[]{bitmap});
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static Drawable getLocalDrawable(String str, Context context, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("7792ec4a", new Object[]{str, context, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        int indexOf = str.indexOf("/");
        String packageName = context.getPackageName();
        if (indexOf > 0) {
            packageName = str.substring(0, indexOf);
        }
        if (StringUtils.equals("com.alipay.android.app.template", context.getPackageName())) {
            packageName = context.getPackageName();
        }
        String substring = str.substring(indexOf + 1);
        if (StringUtils.isEmpty(substring)) {
            return null;
        }
        int indexOf2 = substring.indexOf(".");
        if (indexOf2 > 0) {
            substring = substring.substring(0, indexOf2);
        }
        int resourceId = ResUtils.getResourceId(context, substring, com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, packageName);
        if (resourceId == 0 || resourceId == -1) {
            return null;
        }
        if (i == -1 && i2 == -1) {
            if (z) {
                return new BitmapDrawable(context.getResources(), toGrayscale(BitmapFactory.decodeResource(context.getResources(), resourceId)));
            }
            return context.getResources().getDrawable(resourceId);
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), resourceId);
        int abs = Math.abs(i - decodeResource.getWidth());
        if (Math.abs(i2 - decodeResource.getHeight()) <= 0 && abs <= 0) {
            return new BitmapDrawable(context.getResources(), decodeResource);
        }
        Matrix matrix = new Matrix();
        matrix.postScale(i / decodeResource.getWidth(), i2 / decodeResource.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, false);
        decodeResource.recycle();
        if (createBitmap == null) {
            return null;
        }
        return new BitmapDrawable(context.getResources(), createBitmap);
    }
}
