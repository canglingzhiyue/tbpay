package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.search.common.util.k;
import com.taobao.share.globalmodel.d;
import com.taobao.tao.friends.model.SourceType;
import com.taobao.tao.friends.model.a;
import com.taobao.tao.friends.model.b;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes8.dex */
public class ouh extends oud<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f32429a;
    private Context b;
    private TUrlImageView c;
    private TextView d;
    private TextView e;
    private boolean f;
    private float g;

    static {
        kge.a(-245841215);
    }

    public static /* synthetic */ Object ipc$super(ouh ouhVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Context a(ouh ouhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("57461d4e", new Object[]{ouhVar}) : ouhVar.b;
    }

    public static /* synthetic */ void a(ouh ouhVar, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc0107a", new Object[]{ouhVar, drawable});
        } else {
            ouhVar.a(drawable);
        }
    }

    public static /* synthetic */ TextView b(ouh ouhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("c3ea3a4b", new Object[]{ouhVar}) : ouhVar.d;
    }

    public ouh(Context context) {
        super(context);
        this.g = 5.5f;
        this.b = context;
    }

    @Override // tb.oud
    public View a(boolean z, JSONObject jSONObject) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8e6a6446", new Object[]{this, new Boolean(z), jSONObject});
        }
        this.f = z;
        if (z) {
            this.g = 5.5f;
            a2 = nyq.a(this.b, 60.0f);
            this.f32429a = LayoutInflater.from(this.b).inflate(R.layout.share_weex_contact_item_layout, (ViewGroup) null);
            this.e = (TextView) this.f32429a.findViewById(R.id.tv_recommend);
        } else {
            this.g = 4.5f;
            a2 = nyq.a(this.b, 70.0f);
            this.f32429a = LayoutInflater.from(this.b).inflate(R.layout.share_contact_item_layout, (ViewGroup) null);
        }
        int a3 = (int) (a(this.b) / this.g);
        this.c = (TUrlImageView) this.f32429a.findViewById(R.id.share_contact_item_image);
        this.d = (TextView) this.f32429a.findViewById(R.id.share_contact_nick);
        View findViewById = this.f32429a.findViewById(R.id.rl_item);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
        if (a3 > a2) {
            a2 = a3;
        }
        layoutParams.width = a2;
        findViewById.setLayoutParams(layoutParams);
        return this.f32429a;
    }

    @Override // tb.oud
    public void a(final a aVar, final int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c12d4d", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        b i3 = aVar.i();
        if (!TextUtils.isEmpty(i3.b) && !i3.b.startsWith("http")) {
            i3.b = k.HTTP_PREFIX + i3.b;
        }
        this.c.setImageUrl(i3.b);
        if (TextUtils.isEmpty(i3.f20558a)) {
            this.d.setVisibility(8);
        } else {
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
            this.d.setText(i3.f20558a);
        }
        this.f32429a.setOnClickListener(new View.OnClickListener() { // from class: tb.ouh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    aVar.a().b().a(new d(aVar.c().desc, aVar), ouh.a(ouh.this), i);
                }
            }
        });
        this.d.setTextColor(this.b.getResources().getColor(R.color.share_text_color));
        if (!this.f) {
            this.d.setBackgroundResource(R.drawable.cancle_rectangle_grey);
        }
        if (this.f) {
            TextView textView = this.e;
            if (textView == null) {
                return;
            }
            if (SourceType.RECOMMEND != aVar.j()) {
                i2 = 8;
            }
            textView.setVisibility(i2);
        } else if (SourceType.RECOMMEND == aVar.j()) {
            com.taobao.phenix.intf.b.h().a(nym.a().getApplicationContext()).a(aVar.k()).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.ouh.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    ouh.a(ouh.this, succPhenixEvent.getDrawable());
                    return true;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: tb.ouh.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    ouh.b(ouh.this).setCompoundDrawables(null, null, null, null);
                    return false;
                }
            }).fetch();
        } else {
            this.d.setCompoundDrawables(null, null, null, null);
        }
    }

    private void a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
        } else if (drawable == null) {
        } else {
            drawable.setBounds(0, 0, nyq.a(this.b, 7.0f), nyq.a(this.b, 10.0f));
            this.d.setCompoundDrawables(drawable, null, null, null);
            this.d.setCompoundDrawablePadding(nyq.a(this.b, 5.0f));
        }
    }
}
