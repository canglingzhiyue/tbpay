package tb;

import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.f;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.PanelStyleModel;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes8.dex */
public class tic extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final TextView f34109a;
    private final TUrlImageView b;
    private final thv c;
    private final a d;
    private final View e;
    private long f;

    static {
        kge.a(-335438658);
    }

    public static /* synthetic */ Object ipc$super(tic ticVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ long a(tic ticVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1b2c6e", new Object[]{ticVar, new Long(j)})).longValue();
        }
        ticVar.f = j;
        return j;
    }

    public static /* synthetic */ thv a(tic ticVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (thv) ipChange.ipc$dispatch("cabbbb7a", new Object[]{ticVar}) : ticVar.c;
    }

    public static /* synthetic */ a b(tic ticVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7dc8a00f", new Object[]{ticVar}) : ticVar.d;
    }

    public static /* synthetic */ long c(tic ticVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dd82c880", new Object[]{ticVar})).longValue() : ticVar.f;
    }

    public tic(View view, thv thvVar, a aVar) {
        super(view);
        this.f = 0L;
        this.c = thvVar;
        this.d = aVar;
        this.f34109a = (TextView) view.findViewWithTag(b.ITEM_TV_TAG);
        this.b = (TUrlImageView) view.findViewWithTag(b.ITEM_IV_TAG);
        this.e = view.findViewWithTag(b.ITEM_PARENT_TAG);
    }

    public void a(JSONObject jSONObject, PanelStyleModel panelStyleModel) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0c3311", new Object[]{this, jSONObject, panelStyleModel});
        } else if (panelStyleModel == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
        } else {
            b(jSONObject2, panelStyleModel);
            c(jSONObject2, panelStyleModel);
            a(jSONObject);
        }
    }

    private void b(JSONObject jSONObject, PanelStyleModel panelStyleModel) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ba5c92", new Object[]{this, jSONObject, panelStyleModel});
            return;
        }
        boolean c = this.d.c();
        boolean booleanValue = jSONObject.getBooleanValue(b.IS_CATEGORY_SELECT);
        boolean booleanValue2 = jSONObject.getBooleanValue(b.IS_EDITABLE);
        if (c) {
            str = booleanValue2 ? panelStyleModel.editableTextColor : panelStyleModel.unEditableTextColor;
            str2 = booleanValue2 ? panelStyleModel.editableBgColor : panelStyleModel.unEditableBgColor;
        } else {
            str = booleanValue ? panelStyleModel.textSelectColor : panelStyleModel.textColor;
            str2 = booleanValue ? panelStyleModel.selectBgColor : panelStyleModel.bgColor;
        }
        this.f34109a.setTextColor(b.a(str, "#333333"));
        this.f34109a.setText(jSONObject.getString("text"));
        GradientDrawable gradientDrawable = (GradientDrawable) this.e.getBackground();
        if (gradientDrawable == null) {
            gradientDrawable = new GradientDrawable();
        }
        gradientDrawable.setColor(b.a(str2, "#F6F6F6"));
        gradientDrawable.setCornerRadius(f.a(this.e.getContext(), 6.0f));
        this.e.setBackground(gradientDrawable);
    }

    private void c(JSONObject jSONObject, PanelStyleModel panelStyleModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36688613", new Object[]{this, jSONObject, panelStyleModel});
            return;
        }
        boolean equals = TextUtils.equals(b.MY_CHANNEL, jSONObject.getString(b.CURRENT_MENU_CODE));
        boolean c = this.d.c();
        boolean booleanValue = jSONObject.getBooleanValue(b.IS_EDITABLE);
        if (!equals) {
            onq.a(this.b, panelStyleModel.plusSignImgUrl, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
            this.b.setImageUrl(panelStyleModel.plusSignImgUrl);
            this.b.setVisibility(0);
        } else if (!c) {
            this.b.setVisibility(8);
        } else if (booleanValue) {
            onq.a(this.b, panelStyleModel.minusSignImgUrl, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
            this.b.setImageUrl(panelStyleModel.minusSignImgUrl);
            this.b.setVisibility(0);
        } else {
            this.b.setVisibility(8);
        }
    }

    private void a(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        if (jSONObject2 == null) {
            return;
        }
        final boolean equals = TextUtils.equals(b.MY_CHANNEL, jSONObject2.getString(b.CURRENT_MENU_CODE));
        final boolean c = this.d.c();
        final boolean booleanValue = jSONObject2.getBooleanValue(b.IS_EDITABLE);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: tb.tic.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (!equals) {
                    tic.a(tic.this).b(jSONObject);
                } else if (!c) {
                    tic.a(tic.this).a(jSONObject);
                } else if (!booleanValue) {
                } else {
                    tic.a(tic.this).b(jSONObject);
                }
            }
        });
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: tb.tic.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                if (equals && !tic.b(tic.this).c()) {
                    tic.b(tic.this).a();
                }
                return true;
            }
        });
        this.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: tb.tic.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                tic.a(tic.this).a(equals && booleanValue);
                if (motionEvent.getAction() == 0) {
                    if (System.currentTimeMillis() - tic.c(tic.this) < 300) {
                        z = true;
                    }
                    tic.a(tic.this, System.currentTimeMillis());
                }
                return z;
            }
        });
    }
}
