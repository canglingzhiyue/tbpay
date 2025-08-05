package com.taobao.tao.adapter.biz.taomoment;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import com.taobao.uikit.feature.features.RoundRectFeature;
import com.taobao.uikit.feature.view.TImageView;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.nyy;

/* loaded from: classes8.dex */
public class DetailTaoMomentViewService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Boolean> f19828a;
    private static Map<String, View> b;

    /* loaded from: classes8.dex */
    public static class TaoMomentData implements Serializable {
        public String iconUrl;
        public String jumpUrl;
        public boolean redPoint;
        public String redPointIcon;
        public String status;
        public String tipText;
        public String tipUrl;

        static {
            kge.a(-874479152);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes8.dex */
    public interface a {
        void a(View view);
    }

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : f19828a;
    }

    static {
        kge.a(1035085448);
        f19828a = new HashMap();
        b = new HashMap();
    }

    public View a(Activity activity, JSONObject jSONObject, int i, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5093f431", new Object[]{this, activity, jSONObject, new Integer(i), aVar});
        }
        if (activity != null && aVar != null) {
            final String b2 = b(activity);
            if (!b.containsKey(b2)) {
                FrameLayout frameLayout = new FrameLayout(activity);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(i, i));
                TUrlImageView tUrlImageView = new TUrlImageView(activity);
                tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                tUrlImageView.setTag("icon");
                float f = i / 2.0f;
                ImageShapeFeature imageShapeFeature = new ImageShapeFeature();
                imageShapeFeature.setShape(1);
                imageShapeFeature.setCornerRadius(f, f, f, f);
                imageShapeFeature.setStrokeEnable(true);
                imageShapeFeature.setStrokeWidth(1.0f);
                imageShapeFeature.setStrokeColor(Color.parseColor("#ffffff"));
                tUrlImageView.addFeature(imageShapeFeature);
                frameLayout.addView(tUrlImageView);
                int i2 = i / 4;
                TImageView tImageView = new TImageView(activity);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
                layoutParams.gravity = 8388661;
                tImageView.setLayoutParams(layoutParams);
                tImageView.setBackgroundColor(Color.parseColor("#ff5500"));
                tImageView.setTag("point");
                float f2 = i2 / 2.0f;
                ImageShapeFeature imageShapeFeature2 = new ImageShapeFeature();
                imageShapeFeature2.setShape(1);
                imageShapeFeature2.setCornerRadius(f2, f2, f2, f2);
                imageShapeFeature2.setStrokeEnable(true);
                imageShapeFeature2.setStrokeWidth(1.0f);
                imageShapeFeature2.setStrokeColor(Color.parseColor("#ffffff"));
                tImageView.addFeature(imageShapeFeature2);
                RoundRectFeature roundRectFeature = new RoundRectFeature();
                roundRectFeature.setRadiusX(f2);
                roundRectFeature.setRadiusY(f2);
                tImageView.addFeature(roundRectFeature);
                frameLayout.addView(tImageView);
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.adapter.biz.taomoment.DetailTaoMomentViewService.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        DetailTaoMomentViewService.a().put(b2, false);
                        aVar.a(view);
                    }
                });
                b.put(b2, frameLayout);
                return a(activity, jSONObject);
            } else if (f19828a.get(b2).booleanValue()) {
                return b.get(b2);
            }
        }
        return null;
    }

    public View a(Activity activity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8073db38", new Object[]{this, activity, jSONObject});
        }
        if (activity == null) {
            return null;
        }
        String b2 = b(activity);
        TaoMomentData a2 = a(jSONObject);
        if (a2 == null || TextUtils.isEmpty(a2.redPointIcon)) {
            f19828a.put(b2, false);
        } else {
            View view = b.get(b2);
            if (view == null) {
                f19828a.put(b2, false);
            } else {
                View findViewWithTag = view.findViewWithTag("icon");
                View findViewWithTag2 = view.findViewWithTag("point");
                if ((findViewWithTag instanceof TUrlImageView) && findViewWithTag2 != null) {
                    f19828a.put(b2, true);
                    ((TUrlImageView) findViewWithTag).setImageUrl(a2.redPointIcon);
                    if (a2.redPoint) {
                        findViewWithTag2.setVisibility(0);
                    } else {
                        findViewWithTag2.setVisibility(8);
                    }
                } else {
                    f19828a.put(b2, false);
                }
            }
        }
        if (!f19828a.get(b2).booleanValue()) {
            return null;
        }
        return b.get(b2);
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (activity == null) {
        } else {
            String b2 = b(activity);
            f19828a.remove(b2);
            b.remove(b2);
        }
    }

    private String b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92892385", new Object[]{this, activity});
        }
        return activity.getClass().getName() + activity.hashCode();
    }

    private TaoMomentData a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoMomentData) ipChange.ipc$dispatch("f40acf69", new Object[]{this, jSONObject});
        }
        try {
            return (TaoMomentData) JSON.parseObject(jSONObject.toString(), TaoMomentData.class);
        } catch (Exception e) {
            nyy.c("DetailTaoMomentViewService", e.getMessage());
            return null;
        }
    }
}
