package com.ap.zlz.toyger.zdoc;

import android.graphics.Rect;
import android.graphics.RectF;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class ToygerDocConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String docType;
    public int pageNo;
    public float[] points;
    public Rect rect;
    public float docThreshold = 0.7f;
    public float faceThreshold = 30.0f;
    public float boundaryThreshold = 0.7f;
    public int thickness = 14;
    public int logLevel = 0;
    public String subType = "";
    public int flash = 500;
    public int stackTime = 0;
    public RectF faceROI = new RectF(0.1f, 0.0f, 1.0f, 1.0f);

    static {
        kge.a(-1141632269);
    }

    public static ToygerDocConfig from(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerDocConfig) ipChange.ipc$dispatch("effd3fd7", new Object[]{str}) : (ToygerDocConfig) JSON.parseObject(str, ToygerDocConfig.class);
    }
}
