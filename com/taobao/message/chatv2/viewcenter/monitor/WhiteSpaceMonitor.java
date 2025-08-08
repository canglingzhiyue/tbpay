package com.taobao.message.chatv2.viewcenter.monitor;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeFastText;
import com.taobao.android.dinamicx.view.richtext.DXNativeRichText;
import com.taobao.message.kit.util.FileUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class WhiteSpaceMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WhiteSpaceMonitor";
    public static boolean isLoadSchema;
    public static JSONObject schemaObject;

    static {
        kge.a(1762375251);
    }

    public static WhiteMonitorResult whiteSpaceDetect(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WhiteMonitorResult) ipChange.ipc$dispatch("4e4aa55a", new Object[]{str, view});
        }
        WhiteMonitorResult whiteMonitorResult = new WhiteMonitorResult(str);
        viewDetectInner(view, whiteMonitorResult);
        return whiteMonitorResult;
    }

    private static void viewDetectInner(View view, WhiteMonitorResult whiteMonitorResult) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a4a43ac", new Object[]{view, whiteMonitorResult});
        } else if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
                return;
            }
            Drawable drawable = imageView.getDrawable();
            if (Build.VERSION.SDK_INT >= 23 && (drawable instanceof DrawableWrapper)) {
                drawable = ((DrawableWrapper) drawable).getDrawable();
            }
            if (drawable == null) {
                whiteMonitorResult.addChildViewError(new WhiteMonitorError(imageView.getClass().getSimpleName(), 1, "drawable为空"));
                return;
            }
            if (view instanceof TUrlImageView) {
                whiteMonitorResult.addValidContent(((TUrlImageView) view).getImageUrl());
            }
            whiteMonitorResult.addValidChildView();
        } else if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.getVisibility() == 0 && StringUtils.isEmpty(textView.getText())) {
                whiteMonitorResult.addChildViewError(new WhiteMonitorError(textView.getClass().getSimpleName(), 1, "text 为空"));
                return;
            }
            whiteMonitorResult.addValidChildView();
            whiteMonitorResult.addValidContent(textView.getText().toString());
        } else if (view instanceof DXNativeFastText) {
            DXNativeFastText dXNativeFastText = (DXNativeFastText) view;
            if (dXNativeFastText.getVisibility() == 0 && StringUtils.isEmpty(dXNativeFastText.getContentDescription())) {
                whiteMonitorResult.addChildViewError(new WhiteMonitorError(dXNativeFastText.getClass().getSimpleName(), 1, "text 为空"));
                return;
            }
            whiteMonitorResult.addValidChildView();
            whiteMonitorResult.addValidContent(dXNativeFastText.getContentDescription().toString());
        } else if (view instanceof DXNativeRichText) {
            DXNativeRichText dXNativeRichText = (DXNativeRichText) view;
            if (dXNativeRichText.getVisibility() == 0 && dXNativeRichText.getRichTextRender() != null && StringUtils.isEmpty(dXNativeRichText.getRichTextRender().a().originText())) {
                whiteMonitorResult.addChildViewError(new WhiteMonitorError(dXNativeRichText.getClass().getSimpleName(), 1, "richText 为空"));
                return;
            }
            whiteMonitorResult.addValidChildView();
            whiteMonitorResult.addValidContent(dXNativeRichText.getRichTextRender().a().originText());
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() <= 0) {
                return;
            }
            if ((viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) && viewGroup.getVisibility() == 0) {
                whiteMonitorResult.addViewGroupError(new WhiteMonitorError(viewGroup.getClass().getSimpleName(), 1, "视图宽高为0"));
            } else if (viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0 && viewGroup.getVisibility() == 4) {
                whiteMonitorResult.addViewGroupError(new WhiteMonitorError(viewGroup.getClass().getSimpleName(), 1, "视图不可见"));
            } else {
                whiteMonitorResult.addValidViewGroup();
                for (int i = 0; i < viewGroup.getChildCount() && (childAt = viewGroup.getChildAt(i)) != null; i++) {
                    viewDetectInner(childAt, whiteMonitorResult);
                }
            }
        } else if (view.getWidth() > 0 && view.getHeight() > 0) {
            whiteMonitorResult.addValidChildView();
        }
    }

    public static synchronized void initDataDetect() {
        synchronized (WhiteSpaceMonitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd907624", new Object[0]);
            } else if (isLoadSchema) {
            } else {
                schemaObject = JSONArray.parseObject(FileUtil.loadZipFromAsset(ApplicationUtil.getApplication(), "compress/mpm_schemainfo.json.zip"));
            }
        }
    }

    public static AvailabilityResult dataDetect(JSONObject jSONObject, JSONArray jSONArray, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AvailabilityResult) ipChange.ipc$dispatch("fbc5bd04", new Object[]{jSONObject, jSONArray, list});
        }
        try {
            if (jSONObject == null) {
                AvailabilityResult availabilityResult = new AvailabilityResult();
                availabilityResult.getErrors().add(new AvailabilityError("", -106, " data is all null"));
                availabilityResult.setErrorCode(-106);
                availabilityResult.setErrorMsg("data is all null");
                return availabilityResult;
            } else if (jSONArray == null) {
                TLog.loge(TAG, " schemaKeyArray is null");
                AvailabilityResult availabilityResult2 = new AvailabilityResult();
                availabilityResult2.setIgnore(true);
                return availabilityResult2;
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.size(); i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof String) {
                        checkData(jSONObject, list, (String) obj);
                    } else if (obj instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        for (String str : jSONObject2.keySet()) {
                            Object obj2 = jSONObject.get(str);
                            if (obj2 instanceof String) {
                                AvailabilityError checkData = checkData(obj2, list, str);
                                if (checkData != null) {
                                    arrayList.add(checkData);
                                }
                            } else if (obj2 instanceof JSONArray) {
                                Object obj3 = jSONObject2.get(str);
                                if (obj3 instanceof JSONArray) {
                                    JSONArray jSONArray2 = (JSONArray) obj2;
                                    for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                                        JSONArray jSONArray3 = (JSONArray) obj3;
                                        for (int i3 = 0; i3 < jSONArray3.size(); i3++) {
                                            Object obj4 = jSONArray3.get(i3);
                                            if (obj4 instanceof String) {
                                                String str2 = (String) obj4;
                                                AvailabilityError checkData2 = checkData(jSONObject3.get(str2), list, str2);
                                                if (checkData2 != null) {
                                                    arrayList.add(checkData2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (arrayList.size() <= 0) {
                    return null;
                }
                AvailabilityResult availabilityResult3 = new AvailabilityResult();
                availabilityResult3.setErrors(arrayList);
                return availabilityResult3;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static AvailabilityError checkData(Object obj, List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AvailabilityError) ipChange.ipc$dispatch("45d54132", new Object[]{obj, list, str});
        }
        if (!StringUtils.isEmpty(str) && !str.contains("actionUrl") && !str.contains("actionValue") && !str.contains("ActionValue") && !str.contains("ActionUrl") && !str.equals("title") && !str.contains("price") && !str.contains("Price")) {
            if (obj == null) {
                return new AvailabilityError(str, -103, str + " :data is null");
            } else if (obj instanceof String) {
                String str2 = (String) obj;
                if (!str2.contains("#") && !str2.contains("openApi") && !str2.contains("h5.m.taobao.com") && !list.contains(obj)) {
                    return new AvailabilityError(str, -104, str + ": view data is null");
                }
            }
        }
        return null;
    }
}
