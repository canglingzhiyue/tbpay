package tb;

import android.content.Context;
import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.tao.infoflow.multitab.e;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes8.dex */
public class tkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f34175a;
    private FrameLayout b;

    static {
        kge.a(145578809);
    }

    public static /* synthetic */ FrameLayout a(tkc tkcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("6eece6cd", new Object[]{tkcVar}) : tkcVar.b;
    }

    public static /* synthetic */ View b(tkc tkcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fe87400f", new Object[]{tkcVar}) : tkcVar.f34175a;
    }

    public View a(Context context, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9139e3f5", new Object[]{this, context, jSONObject, new Integer(i)});
        }
        g.a("PanelGuidePopView", "createPopView");
        this.b = a(context);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: tb.tkc.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    tkc.a(tkc.this).setVisibility(8);
                }
            }
        });
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        if (jSONObject2 == null) {
            return this.b;
        }
        a(jSONObject2);
        this.f34175a = b(context, jSONObject2);
        this.b.addView(this.f34175a);
        this.b.addView(a(context, jSONObject2));
        this.b.addView(c(context, jSONObject2));
        this.b.addView(d(context, jSONObject2));
        a(jSONObject, i);
        return this.b;
    }

    public void a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c198176", new Object[]{this, iArr});
        } else if (iArr == null || iArr.length < 4) {
        } else {
            b(iArr);
            c(iArr);
        }
    }

    private void b(final int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ffbcb7", new Object[]{this, iArr});
        } else {
            this.f34175a.post(new Runnable() { // from class: tb.tkc.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int[] iArr2 = iArr;
                    int i = iArr2[0] + (iArr2[2] / 2);
                    int i2 = iArr2[1] + iArr2[3];
                    int[] iArr3 = new int[2];
                    tkc.b(tkc.this).getLocationOnScreen(iArr3);
                    tkc.b(tkc.this).setTranslationX(i - (iArr3[0] + (tkc.b(tkc.this).getWidth() / 2)));
                    tkc.b(tkc.this).setTranslationY(i2 - iArr3[1]);
                }
            });
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.b.postDelayed(new Runnable() { // from class: tb.tkc.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        tkc.a(tkc.this).setVisibility(8);
                    }
                }
            }, jSONObject.getIntValue("showTimeMills") == 0 ? 3000 : jSONObject.getIntValue("showTimeMills"));
        }
    }

    private void c(final int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e5f7f8", new Object[]{this, iArr});
        } else {
            this.b.post(new Runnable() { // from class: tb.tkc.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    View view;
                    int[] iArr2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (tkc.a(tkc.this).getParent() == null) {
                    } else {
                        ((View) tkc.a(tkc.this).getParent()).getLocationOnScreen(new int[2]);
                        int[] iArr3 = new int[2];
                        tkc.a(tkc.this).getLocationOnScreen(iArr3);
                        int[] iArr4 = iArr;
                        float width = (iArr4[0] + (iArr4[2] / 2)) - (iArr3[0] + (tkc.a(tkc.this).getWidth() / 2));
                        if (iArr3[0] + width <= iArr2[0]) {
                            tkc.a(tkc.this).setX(iArr2[0] + 23);
                        } else if (iArr3[0] + width + tkc.a(tkc.this).getWidth() >= view.getWidth()) {
                            tkc.a(tkc.this).setX((view.getWidth() - tkc.a(tkc.this).getWidth()) - 23);
                        } else {
                            tkc.a(tkc.this).setTranslationX(width);
                        }
                        int[] iArr5 = iArr;
                        tkc.a(tkc.this).setTranslationY((iArr5[1] + iArr5[3]) - iArr3[1]);
                    }
                }
            });
        }
    }

    private FrameLayout a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b87ee879", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(gbg.b(context, 184.0f), gbg.b(context, 40.0f)));
        return frameLayout;
    }

    private View a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5dd7f6d2", new Object[]{this, context, jSONObject});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gbg.b(context, 184.0f), gbg.b(context, 36.0f));
        layoutParams.gravity = 80;
        tUrlImageView.setLayoutParams(layoutParams);
        String string = jSONObject.getString(e.KEY_BG_IMG);
        if (!StringUtils.isEmpty(string)) {
            tUrlImageView.setImageUrl(string);
        }
        return tUrlImageView;
    }

    private View b(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3e514cd3", new Object[]{this, context, jSONObject});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gbg.b(context, 8.0f), gbg.b(context, 4.0f));
        layoutParams.gravity = 48;
        tUrlImageView.setLayoutParams(layoutParams);
        String string = jSONObject.getString(b.ARROW_IMG);
        if (!StringUtils.isEmpty(string)) {
            tUrlImageView.setImageUrl(string);
        }
        return tUrlImageView;
    }

    private View c(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ecaa2d4", new Object[]{this, context, jSONObject});
        }
        TextView textView = new TextView(context);
        textView.setText(jSONObject.getString("text"));
        textView.setTextSize(StringUtils.isEmpty(jSONObject.getString("textSize")) ? 14.0f : Integer.parseInt(jSONObject.getString("textSize")));
        textView.setTextColor(Color.parseColor(StringUtils.isEmpty(jSONObject.getString("textColor")) ? "#FFFFFF" : jSONObject.getString("textColor")));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        layoutParams.leftMargin = gbg.b(context, 16.0f);
        layoutParams.topMargin = 4;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private View d(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ff43f8d5", new Object[]{this, context, jSONObject});
        }
        String string = jSONObject.getString(b.PANEL_GUIDE_CLOSE_IMG);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gbg.b(context, 10.0f), gbg.b(context, 10.0f));
        layoutParams.gravity = 8388629;
        layoutParams.topMargin = 4;
        layoutParams.rightMargin = gbg.b(context, 16.0f);
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setLayoutParams(layoutParams);
        if (!StringUtils.isEmpty(string)) {
            tUrlImageView.setImageUrl(string);
        }
        return tUrlImageView;
    }

    private void a(JSONObject jSONObject, int i) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a78e87b", new Object[]{this, jSONObject, new Integer(i)});
        } else if (i == -1 || (jSONObject2 = jSONObject.getJSONObject(h.TRACK_EXPOSURE_PARAM)) == null) {
        } else {
            jSONObject.put("isTracked", (Object) false);
            e.a(jSONObject2, i);
            kss.b(jSONObject);
        }
    }
}
