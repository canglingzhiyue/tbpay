package com.taobao.tbliveinteractive.jsbridge;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.ppr;

/* loaded from: classes8.dex */
public class h implements ppr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f22156a;
    private final String b;
    private com.taobao.alilive.aliliveframework.frame.a c;
    private com.taobao.tbliveinteractive.e d;
    private String e;
    private String f = "";

    @Override // tb.ppr
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // tb.ppr
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // tb.ppr
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // tb.ppr
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    static {
        kge.a(-1023236068);
        kge.a(1429222375);
        f22156a = h.class.getSimpleName();
    }

    public h(String str, com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.tbliveinteractive.e eVar) {
        this.b = str;
        this.c = aVar;
        this.d = eVar;
        this.d.o().a(this);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.d.o().b(this);
        this.d = null;
    }

    @Override // tb.ppr
    public boolean a(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fb80ec2", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        this.d.a("TBLiveWVPlugin.Event.mediaplayer.error", g());
        return false;
    }

    @Override // tb.ppr
    public boolean a(IMediaPlayer iMediaPlayer, long j, long j2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afe7bb3e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), obj})).booleanValue();
        }
        if (pmd.a().m() != null) {
            pnj m = pmd.a().m();
            String str = f22156a;
            m.b(str, "what = " + j + " extra = " + j2);
        }
        if (((int) j) == 715) {
            String str2 = null;
            if (obj != null) {
                str2 = (String) obj;
            }
            if (!StringUtils.isEmpty(str2)) {
                if (pmd.a().m() != null) {
                    pnj m2 = pmd.a().m();
                    String str3 = f22156a;
                    m2.b(str3, "MEDIA_INFO_SEI_USERDEFINED_STRUCT seiData = " + str2);
                }
                if (a(str2)) {
                    this.e = str2;
                    this.d.a("TBLiveWVPlugin.Event.media", b(this.e));
                }
            }
        }
        return false;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            if (!StringUtils.isEmpty(str)) {
                if (this.f.equals(str)) {
                    return false;
                }
                this.f = str;
            }
        } catch (IndexOutOfBoundsException unused) {
        }
        return true;
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "SEI");
            jSONObject.put("data", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // tb.ppr
    public void a(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105dadde", new Object[]{this, iMediaPlayer});
        } else {
            this.d.a("TBLiveWVPlugin.Event.mediaplayer.started", g());
        }
    }

    @Override // tb.ppr
    public void b(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e8cb9f", new Object[]{this, iMediaPlayer});
        } else {
            this.d.a("TBLiveWVPlugin.Event.mediaplayer.paused", g());
        }
    }

    @Override // tb.ppr
    public void c(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9773e960", new Object[]{this, iMediaPlayer});
        } else {
            this.d.a("TBLiveWVPlugin.Event.mediaplayer.completed", g());
        }
    }

    private String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        String f = f();
        if (!StringUtils.isEmpty(f)) {
            try {
                jSONObject.put("url", f);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject.toString();
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.d.o().d();
    }
}
