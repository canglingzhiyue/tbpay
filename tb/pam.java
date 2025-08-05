package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.a;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.d;
import java.util.Map;

/* loaded from: classes8.dex */
public class pam implements pnz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f32534a;

    static {
        kge.a(2096015298);
        kge.a(691515905);
    }

    @Override // tb.pnz
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f32534a;
    }

    @Override // tb.pnz
    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
        } else if (onClickListener == null) {
        } else {
            a.a().a(onClickListener);
        }
    }

    @Override // tb.pnz
    public void a(Context context, d dVar, VideoInfo videoInfo, boolean z, boolean z2, Map<String, String> map, ipz ipzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30bdcef", new Object[]{this, context, dVar, videoInfo, new Boolean(z), new Boolean(z2), map, ipzVar});
            return;
        }
        a.a().a(context, dVar, videoInfo, "liveroom", z, z2, map, ipzVar);
        this.f32534a = a.a().b();
    }

    @Override // tb.pnz
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a.a().e();
        this.f32534a = null;
    }

    @Override // tb.pnz
    public void a(Context context, VideoInfo videoInfo, String str, Map<String, String> map, ipz ipzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ccde70b", new Object[]{this, context, videoInfo, str, map, ipzVar});
        } else {
            a.a().a(context, videoInfo, str, (String) null, map, ipzVar);
        }
    }

    @Override // tb.pnz
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : a.a().d();
    }

    @Override // tb.pnz
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : a.a().c();
    }

    @Override // tb.pnz
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : a.a().k();
    }
}
