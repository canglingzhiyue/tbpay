package com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view;

import android.content.Context;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.emu;
import tb.fpr;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailAdaptiveTextView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ArrayList<String> data;
    private boolean hasMore;
    private Context mContext;
    private int maxLen;
    private String separator;
    private int width;
    private String xEllipsis;

    static {
        kge.a(-2023885715);
    }

    public static /* synthetic */ Object ipc$super(DetailAdaptiveTextView detailAdaptiveTextView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private boolean isMaxLen(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("12411ac6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : i2 != 0 && i >= i2;
    }

    public DetailAdaptiveTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.xEllipsis = "...";
        this.data = new ArrayList<>();
        this.mContext = context;
        emu.a("com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.DetailAdaptiveTextView");
    }

    public void setViewAttr(View view, String str, String str2, JSONArray jSONArray, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b9f9317", new Object[]{this, view, str, str2, jSONArray, str3, str4, str5, str6});
        } else if (jSONArray == null) {
        } else {
            this.separator = str4;
            if (!StringUtils.isEmpty(str6)) {
                this.xEllipsis = str6;
            }
            this.data.clear();
            this.maxLen = 0;
            this.hasMore = false;
            if (str5 != null) {
                try {
                    this.maxLen = Integer.parseInt(str5);
                } catch (Exception unused) {
                    this.maxLen = 0;
                }
            }
            loadData(this.data, jSONArray, str3);
            this.width = getWidth(str, str2);
            setText(parseData());
        }
    }

    private void loadData(ArrayList<String> arrayList, JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d74e05", new Object[]{this, arrayList, jSONArray, str});
            return;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            if (!StringUtils.isEmpty(str)) {
                Object obj = jSONObject.get(str);
                if (obj != null) {
                    String obj2 = obj.toString();
                    if (!StringUtils.isEmpty(obj2)) {
                        arrayList.add(obj2);
                        i++;
                    }
                    if (isMaxLen(i, this.maxLen)) {
                        this.hasMore = true;
                        return;
                    }
                } else {
                    continue;
                }
            } else {
                for (String str2 : jSONObject.keySet()) {
                    if (isMaxLen(i, this.maxLen)) {
                        this.hasMore = true;
                        return;
                    } else if (!StringUtils.isEmpty(str2)) {
                        arrayList.add(str2);
                        i++;
                    }
                }
                continue;
            }
        }
    }

    private int getWidth(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc81c61e", new Object[]{this, str, str2})).intValue();
        }
        return str2 != null ? fpr.a(this.mContext, str2, 375) : fpr.a(this.mContext, str, 375);
    }

    private String parseData() {
        float textViewLength;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ea321c", new Object[]{this});
        }
        String str = "";
        while (true) {
            String str2 = str;
            if (i >= this.data.size()) {
                break;
            }
            if (i == 0) {
                str = str + this.data.get(i);
            } else {
                str = str + this.separator + this.data.get(i);
            }
            if (!this.hasMore) {
                textViewLength = getTextViewLength(this, str);
            } else {
                textViewLength = getTextViewLength(this, str + this.xEllipsis);
            }
            if (textViewLength > this.width) {
                str = i == 0 ? this.data.get(i) : str2;
            } else {
                i++;
            }
        }
        if (!this.hasMore) {
            return str;
        }
        return str + this.xEllipsis;
    }

    public float getTextViewLength(TextView textView, String str) {
        TextPaint paint;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac5a8669", new Object[]{this, textView, str})).floatValue();
        }
        if (textView != null && !StringUtils.isEmpty(str) && (paint = textView.getPaint()) != null) {
            return paint.measureText(str);
        }
        return -1.0f;
    }
}
