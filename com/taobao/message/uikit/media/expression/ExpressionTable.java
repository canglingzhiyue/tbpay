package com.taobao.message.uikit.media.expression;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.ImageSpan;
import android.util.LruCache;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.uikit.util.BitmapUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class ExpressionTable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIG_SIZE = 28;
    private static final int COMPLEX_MAX_COUNT = 20;
    private static final int NORMAL_SIZE = 20;
    private static final String PREFIX = "/:";
    private static final String[] allBizList;
    private static Map<Integer, LruCache<String, Bitmap>> bitMapCache;
    private static LruCache<String, String> complexStringCache;

    static {
        kge.a(1071062066);
        bitMapCache = new HashMap();
        complexStringCache = new LruCache<>(50);
        allBizList = new String[]{"guang", "im"};
    }

    public static Expression getExpressionByStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Expression) ipChange.ipc$dispatch("4d6daeac", new Object[]{str});
        }
        if (str != null && str.contains("O=O")) {
            return getExpressionMap().get(72);
        }
        SparseArray<Expression> allExpressionMap = getAllExpressionMap();
        int size = allExpressionMap.size();
        for (int i = 0; i < size; i++) {
            if (("/:" + str).contains(allExpressionMap.get(i).value)) {
                return allExpressionMap.get(i);
            }
        }
        return null;
    }

    public static String convertExpression(String str) {
        String[] split;
        Expression expression;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59ebab24", new Object[]{str});
        }
        if (StringUtils.isEmpty(str) || (split = str.split("/:")) == null || split.length <= 1) {
            return str;
        }
        if (complexStringCache.get(str) != null) {
            return complexStringCache.get(str);
        }
        String str2 = str;
        int i = 0;
        for (int i2 = 0; i2 < split.length; i2++) {
            if (!StringUtils.isEmpty(split[i2])) {
                if (split[i2].contains("O=O")) {
                    str2 = str2.replace("/:O=O", DisplayUtil.localizedString(R.string.mp_boss_1));
                    i++;
                } else {
                    SparseArray<Expression> allExpressionMap = getAllExpressionMap();
                    int i3 = 0;
                    while (true) {
                        if (i3 < allExpressionMap.size()) {
                            String str3 = allExpressionMap.get(i3).value;
                            String str4 = riy.ARRAY_START_STR + expression.meaning + riy.ARRAY_END_STR;
                            if (("/:" + split[i2]).contains(str3)) {
                                i++;
                                str2 = str2.replace(str3, str4);
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
        }
        if (i > 20) {
            complexStringCache.put(str, str2);
        }
        return str2;
    }

    public static int getExpressionResourceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f627663b", new Object[]{str})).intValue();
        }
        Expression expressionByStr = getExpressionByStr(str);
        if (expressionByStr != null) {
            return expressionByStr.localResInt;
        }
        return -1;
    }

    public static SpannableString getExpressionStringWithCache(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("df47202a", new Object[]{context, str});
        }
        return getExpressionString(context, str, true, checkContainerText(str) ? 20 : 28);
    }

    public static boolean checkContainerText(String str) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f74ccf3b", new Object[]{str})).booleanValue();
        }
        String[] split = str.split("/:");
        if (split.length <= 1) {
            return true;
        }
        int i = 0;
        for (int i2 = 0; i2 < split.length; i2++) {
            if (!StringUtils.isEmpty(split[i2])) {
                if (!str.substring(i, i + 2).equals("/:")) {
                    return true;
                }
                Expression expressionByStr = getExpressionByStr(split[i2]);
                if (expressionByStr == null) {
                    continue;
                } else if (expressionByStr.value.length() != split[i2].length() + 2) {
                    return true;
                } else {
                    if (i2 == 0 && !str.startsWith("/:")) {
                        length = split[i2].length();
                    } else {
                        length = split[i2].length() + 2;
                    }
                    i += length;
                }
            }
        }
        return false;
    }

    public static String replaceExpressionString(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab8ecbf2", new Object[]{str});
        }
        if (StringUtils.isEmpty(str) || (split = str.split("/:")) == null || split.length <= 1) {
            return str;
        }
        String str2 = str;
        for (int i = 0; i < split.length; i++) {
            if (!StringUtils.isEmpty(split[i])) {
                if (split[i].contains("O=O")) {
                    str2 = str2.replace("/:O=O", "");
                } else {
                    SparseArray<Expression> allExpressionMap = getAllExpressionMap();
                    int i2 = 0;
                    while (true) {
                        if (i2 < allExpressionMap.size()) {
                            String str3 = allExpressionMap.get(i2).value;
                            if (("/:" + split[i]).contains(str3)) {
                                str2 = str2.replace(str3, "");
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        return str2;
    }

    private static float getScreenDensity(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fb371fab", new Object[]{context})).floatValue() : context.getApplicationContext().getResources().getDisplayMetrics().density;
    }

    public static SpannableString getExpressionString(Context context, CharSequence charSequence, boolean z, int i) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("42e5a2a3", new Object[]{context, charSequence, new Boolean(z), new Integer(i)});
        }
        SpannableString spannableString = new SpannableString(charSequence);
        String charSequence2 = charSequence.toString();
        String[] split = charSequence2.split("/:");
        if (split != null && split.length > 1) {
            int i2 = 0;
            for (int i3 = 0; i3 < split.length; i3++) {
                if (!StringUtils.isEmpty(split[i3])) {
                    if (!charSequence2.substring(i2, i2 + 2).equals("/:")) {
                        length = split[i3].length();
                    } else {
                        Expression expressionByStr = getExpressionByStr(split[i3]);
                        if (expressionByStr != null) {
                            Bitmap bitmap = null;
                            if (z) {
                                bitmap = getFromCache(context, i, expressionByStr);
                            } else {
                                Bitmap decodeExpression = decodeExpression(context, expressionByStr);
                                if (decodeExpression != null) {
                                    if (!decodeExpression.isRecycled()) {
                                        float f = i;
                                        bitmap = BitmapUtil.zoomBitmap(decodeExpression, (int) (getScreenDensity(context) * f), (int) (f * getScreenDensity(context)));
                                    }
                                    if (decodeExpression != bitmap) {
                                        decodeExpression.recycle();
                                    }
                                }
                            }
                            if (bitmap == null) {
                                return spannableString;
                            }
                            spannableString.setSpan(new ImageSpan(context.getApplicationContext(), bitmap), i2, expressionByStr.value.length() + i2, 33);
                        }
                        if (i3 == 0 && !charSequence2.startsWith("/:")) {
                            length = split[i3].length();
                        } else {
                            length = split[i3].length() + 2;
                        }
                    }
                    i2 += length;
                }
            }
        }
        return spannableString;
    }

    public static Bitmap getFromCache(Context context, int i, Expression expression) {
        LruCache<String, Bitmap> lruCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("33a70195", new Object[]{context, new Integer(i), expression});
        }
        String str = expression.value;
        if (!bitMapCache.containsKey(Integer.valueOf(i)) || bitMapCache.get(Integer.valueOf(i)) == null) {
            Map<Integer, LruCache<String, Bitmap>> map = bitMapCache;
            Integer valueOf = Integer.valueOf(i);
            LruCache<String, Bitmap> lruCache2 = new LruCache<>(100);
            map.put(valueOf, lruCache2);
            lruCache = lruCache2;
        } else {
            lruCache = bitMapCache.get(Integer.valueOf(i));
        }
        Bitmap bitmap = null;
        if (lruCache == null) {
            return null;
        }
        if (lruCache.get(str) == null) {
            Bitmap decodeExpression = decodeExpression(context, expression);
            if (decodeExpression == null) {
                return null;
            }
            try {
                if ("1".equals(ConfigUtil.getValue("mpm_business_switch", "lockZoomBitmap", "1"))) {
                    synchronized (ExpressionTable.class) {
                        if (!decodeExpression.isRecycled()) {
                            float f = i;
                            bitmap = BitmapUtil.zoomBitmap(decodeExpression, (int) (getScreenDensity(context) * f), (int) (f * getScreenDensity(context)));
                        }
                    }
                } else if (!decodeExpression.isRecycled()) {
                    float f2 = i;
                    bitmap = BitmapUtil.zoomBitmap(decodeExpression, (int) (getScreenDensity(context) * f2), (int) (f2 * getScreenDensity(context)));
                }
            } catch (OutOfMemoryError unused) {
                if (Build.VERSION.SDK_INT >= 21) {
                    lruCache.resize(lruCache.size() / 2);
                }
                if (!decodeExpression.isRecycled()) {
                    float f3 = i;
                    bitmap = BitmapUtil.zoomBitmap(decodeExpression, (int) (getScreenDensity(context) * f3), (int) (f3 * getScreenDensity(context)));
                }
            }
            if ("1".equals(ConfigUtil.getValue("mpm_business_switch", "recycleBitmap", "0")) && decodeExpression != bitmap) {
                decodeExpression.recycle();
            }
            lruCache.put(str, bitmap);
            bitMapCache.put(Integer.valueOf(i), lruCache);
        }
        return lruCache.get(str);
    }

    public static SparseArray<Expression> getExpressionMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseArray) ipChange.ipc$dispatch("13a52da4", new Object[0]) : getExpressionMap(null);
    }

    public static SparseArray<Expression> getAllExpressionMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseArray) ipChange.ipc$dispatch("ee181e79", new Object[0]) : getExpressionMap(allBizList);
    }

    public static SparseArray<Expression> getExpressionMap(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("b54e7b2f", new Object[]{strArr});
        }
        SparseArray<Expression> expressionTableByBiz = TaoExpressionProviderV2.getInstance().getExpressionTableByBiz(strArr);
        return expressionTableByBiz == null ? new SparseArray<>() : expressionTableByBiz;
    }

    public static void registerEmotionWithBiz(String str, List<Expression> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ca70d7", new Object[]{str, list});
        } else {
            TaoExpressionProviderV2.getInstance().registerEmotionWithBiz(str, list);
        }
    }

    public static Bitmap decodeExpression(Context context, Expression expression) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("36b674c", new Object[]{context, expression});
        }
        if (expression == null || context == null) {
            return null;
        }
        int i = expression.pathType;
        if (i == 0) {
            return BitmapFactory.decodeResource(context.getResources(), expression.localResInt);
        }
        if (i != 1) {
            return null;
        }
        try {
            return BitmapFactory.decodeFile(expression.source);
        } catch (Exception e) {
            TLog.loge("emotion", "decode emotion assets failed: " + e.toString());
            return null;
        }
    }
}
