package tb;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.d;
import com.taobao.share.ui.engine.structure.a;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes8.dex */
public class oug extends oud<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f32427a;
    private View b;
    private TUrlImageView c;
    private Context d;
    private TextView e;
    private JSONObject f;

    static {
        kge.a(1155730942);
    }

    public static /* synthetic */ Object ipc$super(oug ougVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Context a(oug ougVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("667515ef", new Object[]{ougVar}) : ougVar.d;
    }

    public oug(Context context) {
        super(context);
        this.d = context;
        this.f = new JSONObject();
    }

    @Override // tb.oud
    public View a(boolean z, JSONObject jSONObject) {
        float f;
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8e6a6446", new Object[]{this, new Boolean(z), jSONObject});
        }
        if (z) {
            f = 5.5f;
            if (jSONObject != null && jSONObject.getFloatValue(com.taobao.android.weex_framework.util.a.ATOM_EXT_column) > 0.0f) {
                f = jSONObject.getFloat(com.taobao.android.weex_framework.util.a.ATOM_EXT_column).floatValue();
            }
            a2 = nyq.a(this.d, 60.0f);
            this.f32427a = LayoutInflater.from(this.d).inflate(R.layout.share_new_weex_channel_item_layout, (ViewGroup) null);
        } else {
            f = 4.5f;
            a2 = nyq.a(this.d, 70.0f);
            this.f32427a = LayoutInflater.from(this.d).inflate(R.layout.share_new_channel_item_layout, (ViewGroup) null);
        }
        this.c = (TUrlImageView) this.f32427a.findViewById(R.id.share_channel_item_image);
        this.e = (TextView) this.f32427a.findViewById(R.id.tv_channel_name);
        int a3 = (int) (a(this.d) / f);
        if (a3 <= a2) {
            a3 = a2;
        }
        this.b = this.f32427a.findViewById(R.id.rl_item);
        a(a3, jSONObject);
        return this.f32427a;
    }

    private void a(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e86c6b5", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.width = i;
        if (jSONObject == null) {
            this.b.setLayoutParams(layoutParams);
            return;
        }
        this.f = jSONObject.getJSONObject("iconMap");
        if (this.f == null) {
            this.f = new JSONObject();
        }
        int intValue = jSONObject.getIntValue("height");
        if (intValue > 0) {
            layoutParams.height = nyq.a(this.d, intValue / 2);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.c.getLayoutParams();
        int intValue2 = jSONObject.getIntValue("iconSize");
        int a2 = nyq.a(this.d, intValue2 / 2);
        if (intValue2 > 0) {
            layoutParams2.width = a2;
            layoutParams2.height = a2;
            this.c.setLayoutParams(layoutParams2);
        }
        int intValue3 = jSONObject.getIntValue("textSize");
        if (intValue3 > 0) {
            this.e.setTextSize(1, intValue3 / 2);
        }
        String string = jSONObject.getString("textColor");
        if (!TextUtils.isEmpty(string)) {
            this.e.setTextColor(Color.parseColor(string));
        }
        int a3 = nyq.a(this.d, jSONObject.getIntValue("space") / 2);
        if (a3 > 0) {
            TextView textView = this.e;
            textView.setPadding(textView.getPaddingLeft(), a3, this.e.getPaddingRight(), this.e.getPaddingBottom());
        }
        int textSize = (int) ((((layoutParams.height - this.e.getTextSize()) - a2) - a3) / 2.0f);
        View view = this.b;
        view.setPadding(view.getPaddingLeft(), textSize, this.b.getPaddingRight(), this.b.getBottom());
        this.b.setLayoutParams(layoutParams);
    }

    @Override // tb.oud
    public void a(final a aVar, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b00875c", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        com.taobao.share.globalmodel.a d = aVar.d();
        this.c.setWhenNullClearImg(true);
        String string = this.f.getString(d.c());
        if (!TextUtils.isEmpty(string)) {
            this.c.setImageUrl(null);
            this.c.setImageUrl(string);
        } else if (!TextUtils.isEmpty(d.b())) {
            this.c.setImageUrl(null);
            this.c.setImageUrl(d.b());
        } else if (d.e() == -1 && d.f() > 0) {
            this.c.setImageResource(d.f());
        }
        if (d.d() != null) {
            this.e.setText(d.d());
        }
        if (!TextUtils.isEmpty(d.h())) {
            this.f32427a.setContentDescription(d.h());
        }
        this.f32427a.setOnClickListener(new View.OnClickListener() { // from class: tb.oug.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    aVar.a().b().a(new d(aVar.c().desc, aVar), oug.a(oug.this), i);
                }
            }
        });
    }
}
