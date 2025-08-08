package com.taobao.tao.adapter.biz;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.sharepanel.normal.NativeSharePanel;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.nys;
import tb.nza;
import tb.nzb;
import tb.nzc;
import tb.nzd;
import tb.nze;
import tb.nzf;
import tb.nzn;
import tb.obh;
import tb.obk;
import tb.oif;
import tb.oim;
import tb.oub;

/* loaded from: classes8.dex */
public class ShareEngine implements Serializable, nzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WeakReference<oub> mCurSharePanel;

    static {
        kge.a(-497415259);
        kge.a(-548686591);
        kge.a(1028243835);
    }

    @Override // tb.nzd
    public nze getSharePanel() {
        String c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nze) ipChange.ipc$dispatch("2c0ce6eb", new Object[]{this});
        }
        if (obh.a()) {
            if (StringUtils.equals("1", nys.b(com.taobao.tao.sharepanel.weex.a.CACHE_SHOW_CHANNEL_TYPE_KEY, "2"))) {
                c = obh.b();
            } else {
                c = obh.c();
            }
            com.taobao.tao.sharepanel.weex.a aVar = new com.taobao.tao.sharepanel.weex.a(c);
            this.mCurSharePanel = new WeakReference<>(aVar);
            return aVar;
        }
        NativeSharePanel nativeSharePanel = new NativeSharePanel();
        this.mCurSharePanel = new WeakReference<>(nativeSharePanel);
        return nativeSharePanel;
    }

    @Override // tb.nzd
    /* renamed from: getCurSharePanel  reason: collision with other method in class */
    public oub mo1241getCurSharePanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oub) ipChange.ipc$dispatch("221bcf4", new Object[]{this});
        }
        WeakReference<oub> weakReference = this.mCurSharePanel;
        if (weakReference != null && weakReference.get() != null) {
            return this.mCurSharePanel.get();
        }
        return null;
    }

    @Override // tb.nzd
    public void initHandlerMappings(nzn nznVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a99adb4", new Object[]{this, nznVar});
            return;
        }
        oif oifVar = (oif) nznVar;
        if (oifVar.f32085a == null) {
            oifVar.f32085a = new oif.a();
        }
        obk.a().a(new com.taobao.tao.adapter.biz.plugins.a());
    }

    @Override // tb.nzd
    public nza getChanelEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nza) ipChange.ipc$dispatch("a6971079", new Object[]{this}) : new com.taobao.tao.channel.a();
    }

    @Override // tb.nzd
    public nzf getTLongPicEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nzf) ipChange.ipc$dispatch("741259d3", new Object[]{this}) : new com.taobao.tao.longpic.a();
    }

    @Override // tb.nzd
    public nzb getQRCodeScanEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nzb) ipChange.ipc$dispatch("83a93e26", new Object[]{this}) : new com.taobao.tao.scancode.a();
    }

    @Override // tb.nzd
    public nzc getShareBizEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nzc) ipChange.ipc$dispatch("707de25c", new Object[]{this}) : new nzc() { // from class: com.taobao.tao.adapter.biz.ShareEngine.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nzc
            public void a(com.taobao.share.taopassword.genpassword.model.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e7580095", new Object[]{this, aVar});
                } else {
                    new oim().a(aVar);
                }
            }
        };
    }
}
