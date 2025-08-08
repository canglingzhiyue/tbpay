package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.f;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.android.detail.core.standard.video.d;
import com.taobao.android.detail.core.utils.a;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public final class dxq extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HANDLEDETAILBRANDPROMOTIONVIDEOSHOW = 7619439952439468904L;

    /* renamed from: a  reason: collision with root package name */
    public static String f27068a;
    private String b;
    private boolean c;

    public static /* synthetic */ Object ipc$super(dxq dxqVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-1132921036);
        f27068a = dxq.class.getSimpleName();
    }

    public dxq() {
        emu.a("com.taobao.android.detail.core.aura.extension.video.DXHandleDetailBrandPromotionVideoShowEventHandler");
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
            return;
        }
        super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        String str = f27068a;
        i.d(str, "prepareBindEventWithArgs " + this + "," + objArr.toString() + "," + dXRuntimeContext);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        String str = f27068a;
        i.d(str, "handleEvent: " + this + "," + dXEvent + "," + objArr + "," + dXRuntimeContext);
        String obj = (objArr == null || objArr.length <= 0 || objArr[0] == null) ? "" : objArr[0].toString();
        String str2 = f27068a;
        i.d(str2, "mCurrentStatus： " + this.b + "," + obj);
        if (StringUtils.equals(this.b, obj)) {
            return;
        }
        this.b = obj;
        a(dXRuntimeContext);
    }

    private void a(DXRuntimeContext dXRuntimeContext) {
        awz a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487cd5d9", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext == null || (a2 = a(dXRuntimeContext.s())) == null) {
        } else {
            int e = a2.e();
            if (!"appear".equals(this.b)) {
                if (!"disappear".equals(this.b)) {
                    return;
                }
                if (e == 2) {
                    z = true;
                }
                this.c = z;
                if (1 != e) {
                    return;
                }
                a2.c();
            } else if (e != 0 && 2 != e) {
            } else {
                boolean b = b(dXRuntimeContext);
                String str = f27068a;
                i.d(str, "canAutoPlay:" + b);
                if (e == 0 && b) {
                    a2.a();
                } else if (2 != e || this.c || a(dXRuntimeContext, false)) {
                } else {
                    a2.b();
                }
            }
        }
    }

    private awz a(View view) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (awz) ipChange.ipc$dispatch("396b8d58", new Object[]{this, view});
        }
        if (view == null || (findViewById = view.findViewById(R.id.aura_video_player_view_id)) == null) {
            return null;
        }
        Object tag = findViewById.getTag(R.id.aura_video_player);
        if (tag instanceof awz) {
            return (awz) tag;
        }
        return null;
    }

    private boolean b(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8c07f39e", new Object[]{this, dXRuntimeContext})).booleanValue() : a.a(com.taobao.tao.navigation.a.b()) && a() && !a(dXRuntimeContext, true);
    }

    private boolean a(DXRuntimeContext dXRuntimeContext, boolean z) {
        AbsPicGalleryVideoPlayer g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c71e981f", new Object[]{this, dXRuntimeContext, new Boolean(z)})).booleanValue();
        }
        d c = c(dXRuntimeContext);
        if (c == null || (g = c.g()) == null) {
            return false;
        }
        String p = g.p();
        if (z && StringUtils.equals(p, "init")) {
            return true;
        }
        return StringUtils.equals(p, AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING);
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : f.q();
    }

    private d c(DXRuntimeContext dXRuntimeContext) {
        elq a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("54267be9", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext == null) {
            return null;
        }
        Object a3 = dXRuntimeContext.a();
        if (!(a3 instanceof art)) {
            return null;
        }
        art artVar = (art) a3;
        if (artVar.f25540a != null && (a2 = elr.a((String) artVar.f25540a.a("token", String.class))) != null) {
            return a2.h();
        }
        return null;
    }
}
