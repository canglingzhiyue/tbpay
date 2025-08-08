package com.taobao.message.kit.util;

import android.content.res.Resources;
import android.graphics.Rect;
import mtopsdk.common.util.StringUtils;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.message.uikit.util.ApplicationUtil;
import tb.ado;
import tb.kge;

/* loaded from: classes7.dex */
public class ImageUrlUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String THUMBHEIGHT = "thumb_height";
    private static final String THUMBWIDTH = "thumb_width";
    private static final int maxServerHeight = 4096;
    private static final int maxServerWidth = 4096;
    private static final int minScreenWidth;
    private static final int minServerWidth = 60;
    private static int screenHeight;
    private static int screenWidth;

    static {
        kge.a(1418801391);
        screenWidth = 0;
        screenHeight = 0;
        minScreenWidth = (int) (Resources.getSystem().getDisplayMetrics().density * 60.0f);
    }

    public static String getThumbnailPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6415a54", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        Rect generateImageSize = generateImageSize(str);
        if (str.startsWith("http") && str.contains("mobileimweb/fileupload/downloadPriFile.do")) {
            String replace = str.replace("downloadPriFile.do", "getThumbnail.do").replace("&YWOriginalImage=0", "").replace("&YWOriginalImage=1", "").replace("&YWShowOriginal=1", "").replace("&YWShowOriginal=0", "");
            int[] calculateThumailSize = calculateThumailSize(generateImageSize.width(), generateImageSize.height());
            return generateNewSizeThumnailImageUrl(replace, calculateThumailSize[0], calculateThumailSize[1]);
        }
        return checkHttpUrl(str);
    }

    private static Rect generateImageSize(String str) {
        String[] split;
        String str2;
        String[] split2;
        String[] split3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("c9e0e0a1", new Object[]{str});
        }
        Rect rect = new Rect(0, 0, -1, -1);
        if (!StringUtils.isEmpty(str) && (split = str.split("\\?")) != null && split.length == 2 && (str2 = split[1]) != null && (split2 = str2.split("&")) != null && split2.length > 0) {
            for (String str3 : split2) {
                if (str3 != null && (split3 = str3.split("=")) != null && split3.length == 2) {
                    if (split3[0].equals("width") && StringUtils.isDigitsOnly(split3[1])) {
                        rect.right = Integer.parseInt(split3[1]);
                    } else if (split3[0].equals("height") && StringUtils.isDigitsOnly(split3[1])) {
                        rect.bottom = Integer.parseInt(split3[1]);
                    }
                }
            }
        }
        return rect;
    }

    private static String checkHttpUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46cef7b0", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (str.startsWith(ado.URL_SEPARATOR)) {
            sb.append("http:");
            sb.append(str);
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    private static int[] calculateThumailSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("cc750caa", new Object[]{new Integer(i), new Integer(i2)});
        }
        if (screenWidth == 0) {
            screenWidth = ((WindowManager) ApplicationUtil.getApplication().getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getWidth();
        }
        if (screenHeight == 0) {
            screenHeight = ((WindowManager) ApplicationUtil.getApplication().getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getHeight();
        }
        int max = Math.max(minScreenWidth, 60);
        int max2 = Math.max(max, Math.min(screenWidth / 2, 4096));
        return calculateScaleSize(i2, i, Math.max(max2, Math.max(max, Math.min(screenHeight / 2, 4096))), max2, max);
    }

    private static int[] calculateScaleSize(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("e68357ad", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
        int[] iArr = {i2, i};
        float f = i5;
        float f2 = f * 1.0f;
        float f3 = i4;
        float f4 = i3;
        float f5 = (f4 * 1.0f) / f;
        float f6 = i;
        float f7 = f6 * 1.0f;
        float f8 = i2;
        float f9 = f7 / f8;
        if (f2 / f3 > f9 || f5 < f9) {
            if (f9 > f5) {
                iArr[0] = i5;
                iArr[1] = i3;
            } else {
                iArr[0] = i4;
                iArr[1] = i5;
            }
        } else if (i > i2) {
            if (i2 < i5) {
                iArr[0] = i5;
                iArr[1] = (int) ((f2 / f8) * f6);
            } else if (i2 > i4) {
                iArr[0] = (int) (((f8 * 1.0f) * f4) / f6);
                iArr[1] = i3;
            } else if (i > i3) {
                iArr[0] = (int) (((f8 * 1.0f) * f4) / f6);
                iArr[1] = i3;
            } else {
                iArr[0] = i2;
                iArr[1] = i;
            }
        } else if (i < i5) {
            iArr[0] = (int) ((f2 / f6) * f8);
            iArr[1] = i5;
        } else if (i > i3) {
            iArr[0] = i4;
            iArr[1] = (int) ((f7 * f3) / f8);
        } else if (i2 > i4) {
            iArr[0] = i4;
            iArr[1] = (int) ((f7 * f3) / f8);
        } else {
            iArr[0] = i2;
            iArr[1] = i;
        }
        return iArr;
    }

    private static String generateNewSizeThumnailImageUrl(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39baf54d", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        if (str.indexOf(63) == -1) {
            str = str + "?";
        }
        if (StringUtils.isEmpty(str) || str.contains(THUMBWIDTH) || str.contains(THUMBHEIGHT)) {
            return str;
        }
        return str + "&" + THUMBWIDTH + "=" + i + "&" + THUMBHEIGHT + "=" + i2;
    }
}
