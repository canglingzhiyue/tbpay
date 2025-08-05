package com.taobao.tao.welcome;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.d;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class g extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public d c;

    static {
        kge.a(241460803);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public g(Activity activity, d.a aVar) {
        super(activity, aVar);
    }

    @Override // com.taobao.tao.welcome.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.c == null) {
            this.c = new b(this.b, R.string.provision_title_exit_view_mode, R.string.plan1_page2_content_3, new int[]{R.id.provision_negative_button_view_mode, R.id.provision_positive_button}, new int[]{R.string.privacy_text_disagree_continue_view_mode, R.string.privacy_text_agree_exit_view_mode});
            this.c.a(new d.a() { // from class: com.taobao.tao.welcome.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.welcome.d.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    HostController.exitViewMode(g.this.b);
                    g.this.c.dismiss();
                    g.this.f21197a.a();
                }

                @Override // com.taobao.tao.welcome.d.a
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        return;
                    }
                    g.this.c.dismiss();
                    g.this.f21197a.a(i);
                }
            });
        }
        this.c.show();
    }
}
