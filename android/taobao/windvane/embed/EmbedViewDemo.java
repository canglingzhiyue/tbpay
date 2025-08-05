package android.taobao.windvane.embed;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class EmbedViewDemo extends BaseEmbedView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: tv  reason: collision with root package name */
    public TextView f1583tv;

    static {
        kge.a(16697607);
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35692924", new Object[]{this}) : "demo";
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i2 = this.params.mWidth;
        int i3 = this.params.mHeight;
        if (context instanceof Activity) {
            Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
            int i4 = displayMetrics.heightPixels;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (i3 * (i / i2)));
        layoutParams.addRule(13);
        this.f1583tv = new TextView(context);
        this.f1583tv.setBackgroundColor(-7829368);
        this.f1583tv.setText("EmbedView DEMO");
        this.f1583tv.setTextColor(-65536);
        this.f1583tv.setTextSize(30.0f);
        this.f1583tv.setGravity(17);
        relativeLayout.addView(this.f1583tv, layoutParams);
        return relativeLayout;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if ("setText".equals(str)) {
                    if (this.f1583tv != null) {
                        this.f1583tv.setText(jSONObject.getString("text"));
                        wVCallBackContext.success();
                    }
                    return true;
                } else if ("setTextSize".equals(str)) {
                    if (this.f1583tv != null) {
                        this.f1583tv.setTextSize(Float.valueOf(jSONObject.getString("size")).floatValue());
                        wVCallBackContext.success();
                    }
                    return true;
                } else if ("setBackground".equals(str)) {
                    if (this.f1583tv != null) {
                        this.f1583tv.setBackgroundColor(Color.parseColor(jSONObject.getString("color")));
                        wVCallBackContext.success();
                    }
                    return true;
                } else if ("setTextColor".equals(str)) {
                    if (this.f1583tv != null) {
                        this.f1583tv.setTextColor(Color.parseColor(jSONObject.getString("color")));
                        wVCallBackContext.success();
                    }
                    return true;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
