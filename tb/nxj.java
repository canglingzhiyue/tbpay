package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.NxTabLayout;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.c;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.m;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes8.dex */
public class nxj extends NxTabLayout.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DP_IMG_HEIGHT = 16;

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f31830a;
    public TextView b;
    public ImageView c;
    public TUrlImageView d;
    public FrameLayout e;
    public c f;
    public float g = 1.125f;
    private boolean h;

    static {
        kge.a(103178290);
    }

    public static /* synthetic */ Object ipc$super(nxj nxjVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(nxj nxjVar, Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c570f867", new Object[]{nxjVar, drawable, new Integer(i)});
        } else {
            nxjVar.a(drawable, i);
        }
    }

    public static /* synthetic */ void a(nxj nxjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb15adc", new Object[]{nxjVar, new Boolean(z)});
        } else {
            nxjVar.b(z);
        }
    }

    public nxj(LayoutInflater layoutInflater, Context context, boolean z) {
        ipj d = context instanceof ipk ? ((ipk) context).d() : null;
        if (d != null) {
            this.f31830a = d.c();
        }
        if (this.f31830a == null) {
            this.f31830a = (RelativeLayout) layoutInflater.inflate(R.layout.tbsearch_custom_tab, (ViewGroup) new FrameLayout(context), false);
        }
        this.b = (TextView) this.f31830a.findViewById(R.id.tab_text);
        this.c = (ImageView) this.f31830a.findViewById(R.id.tab_icon);
        this.e = (FrameLayout) this.f31830a.findViewById(R.id.tab_item);
        this.d = (TUrlImageView) this.f31830a.findViewById(R.id.tab_guide);
        this.h = z;
        if (this.h) {
            TextView textView = this.b;
            m mVar = m.INSTANCE;
            textView.setTextSize(1, m.a(m.a.INSTANCE.b(), true));
        }
    }

    public void a(final boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.h) {
        } else {
            if (this.f31830a.getMeasuredWidth() <= 0) {
                z2 = false;
            }
            if (z2) {
                b(z);
            } else {
                this.f31830a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: tb.nxj.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                            return;
                        }
                        if (Build.VERSION.SDK_INT >= 16) {
                            nxj.this.f31830a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        } else {
                            nxj.this.f31830a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        }
                        nxj.a(nxj.this, z);
                    }
                });
            }
        }
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        RelativeLayout relativeLayout = this.f31830a;
        relativeLayout.setPivotX(relativeLayout.getMeasuredWidth() / 2.0f);
        RelativeLayout relativeLayout2 = this.f31830a;
        relativeLayout2.setPivotY(relativeLayout2.getMeasuredHeight() / 2.0f);
        float f = 1.0f;
        this.f31830a.setScaleX(z ? this.g : 1.0f);
        RelativeLayout relativeLayout3 = this.f31830a;
        if (z) {
            f = this.g;
        }
        relativeLayout3.setScaleY(f);
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(str);
            this.b.setTextColor(i);
            this.b.setVisibility(0);
        }
        ImageView imageView = this.c;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }

    public void a(String str, int i, int i2, String str2) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        final int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6348715c", new Object[]{this, str, new Integer(i), new Integer(i2), str2});
            return;
        }
        c cVar = this.f;
        if (cVar != null && !cVar.a()) {
            this.f.b();
        }
        if (!StringUtils.isEmpty(str2) && (imageView = this.c) != null) {
            imageView.setContentDescription(str2);
        }
        if (i2 > 0) {
            i3 = l.a((i / i2) * 16.0f);
        }
        this.f = b.h().a(str).addLoaderExtra(esr.BUNDLE_BIZ_CODE, "8920").succListener(new a<SuccPhenixEvent>() { // from class: tb.nxj.2
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
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable != null && !succPhenixEvent.isIntermediate()) {
                    nxj.a(nxj.this, drawable, i3);
                }
                c ticket = succPhenixEvent.getTicket();
                if (ticket != null && !ticket.a()) {
                    ticket.a(true);
                }
                return true;
            }
        }).fetch();
    }

    private void a(Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36c68f7", new Object[]{this, drawable, new Integer(i)});
            return;
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            if (i > 0 && imageView.getLayoutParams().width != i) {
                this.c.getLayoutParams().width = i;
                this.c.requestLayout();
            }
            this.c.setImageDrawable(drawable);
            this.c.setVisibility(0);
        }
        TextView textView = this.b;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
