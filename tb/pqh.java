package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.LiveEmbedType;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.c;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.utils.m;
import com.taobao.taolive.sdk.utils.u;
import java.util.Random;

/* loaded from: classes8.dex */
public class pqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static pqh f32816a;
    private static final String e;
    private Random b = new Random();
    private d c;
    private String d;

    static {
        kge.a(-49537369);
        e = pqh.class.getSimpleName();
    }

    public static pqh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pqh) ipChange.ipc$dispatch("f094377", new Object[0]);
        }
        if (f32816a == null) {
            f32816a = new pqh();
        }
        return f32816a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        return this.b.nextInt(1000) + "_" + System.currentTimeMillis();
    }

    public boolean a(a aVar, String str, TBLiveDataModel tBLiveDataModel, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4, LiveEmbedType liveEmbedType, pnn pnnVar, boolean z5, d.a aVar2) {
        boolean z6;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab798374", new Object[]{this, aVar, str, tBLiveDataModel, str2, str3, new Boolean(z), new Boolean(z2), new Boolean(z3), str4, new Boolean(z4), liveEmbedType, pnnVar, new Boolean(z5), aVar2})).booleanValue();
        }
        String str6 = e;
        m.a(str6, "initLiveRoomPM init mPMID = " + this.d + " newPMID = " + str);
        d dVar = this.c;
        if (dVar != null) {
            dVar.c();
            this.c.g();
            String str7 = e;
            m.a(str7, "initLiveRoomPM destroyLastPM mPMID = " + this.d + " newPMID = " + str);
            z6 = true;
        } else {
            z6 = false;
        }
        this.d = str;
        if (z3) {
            str5 = " newPMID = ";
            this.c = new d(1, tBLiveDataModel.mVideoInfo.topic, str4, z2, z, tBLiveDataModel.mVideoInfo.forceCommentsUseCdn, false, aVar2);
        } else {
            str5 = " newPMID = ";
            poy.e(k.a(tBLiveDataModel.mVideoInfo), aVar);
            this.c = new c(1, str2, str4, str3, z2, z, tBLiveDataModel.mVideoInfo.forceCommentsUseCdn, false, "1".equals(tBLiveDataModel.mVideoInfo.roomStatus), z4, !StringUtils.isEmpty(tBLiveDataModel.mVideoInfo.fetchMSGCdnUrl) || (tBLiveDataModel.mVideoInfo.fetchItemUseCdn && u.r() && !StringUtils.isEmpty(tBLiveDataModel.mVideoInfo.fetchItemUseCdnUrl)), aVar2);
            pqi.a().a("Page_TaobaoLiveWatch", "LiveRoomInit", pqi.a().b());
        }
        if (u.aP() && tBLiveDataModel.mVideoInfo.isOfficialType()) {
            this.c.b(true);
            this.c.f(tBLiveDataModel.mVideoInfo.officialLiveInfo.encryptAnchorId);
            this.c.g(tBLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveId);
            this.c.h(tBLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveTopic);
        }
        this.c.a(liveEmbedType);
        this.c.a(pnnVar);
        this.c.a(z5);
        this.c.c(tBLiveDataModel.mVideoInfo.liveId);
        this.c.a(tBLiveDataModel.mVideoInfo.fetchItemUseCdnUrl);
        this.c.b(tBLiveDataModel.mVideoInfo.fetchMSGCdnUrl);
        this.c.d();
        this.c.a();
        String str8 = e;
        m.a(str8, "initLiveRoomPM start mPMID = " + this.d + str5 + str);
        return z6;
    }

    public boolean a(String str, String str2, boolean z, String str3, String str4, pnn pnnVar, d.a aVar) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2044054d", new Object[]{this, str, str2, new Boolean(z), str3, str4, pnnVar, aVar})).booleanValue();
        }
        String str5 = e;
        m.a(str5, "initPM init mPMID = " + this.d + " newPMID = " + str);
        d dVar = this.c;
        if (dVar != null) {
            dVar.c();
            this.c = null;
            String str6 = e;
            m.a(str6, "initPM destroyLastPM mPMID = " + this.d + " newPMID = " + str);
            z2 = true;
        } else {
            z2 = false;
        }
        this.d = str;
        this.c = new c(1, str2, null, str3, false, true, false, false, z, false, false, aVar);
        this.c.c(str4);
        this.c.a(pnnVar);
        this.c.d();
        this.c.a();
        String str7 = e;
        m.a(str7, "initPM start mPMID = " + this.d + " newPMID = " + str);
        return z2;
    }

    public void a(com.taobao.taolive.sdk.core.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd497c", new Object[]{this, dVar});
            return;
        }
        d dVar2 = this.c;
        if (dVar2 == null) {
            return;
        }
        dVar2.a(dVar);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String str2 = e;
        m.a(str2, "destroyPM init mPMID = " + this.d + " newPMID = " + str);
        if (str == null) {
            return;
        }
        String str3 = this.d;
        if (str3 != null && !str3.equals(str)) {
            return;
        }
        d dVar = this.c;
        if (dVar != null) {
            dVar.c();
            this.c.g();
            this.c = null;
        }
        this.d = null;
        String str4 = e;
        m.a(str4, "destroyPM stop mPMID = " + this.d + " newPMID = " + str);
    }

    public d c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("bfd29766", new Object[]{this}) : this.c;
    }
}
