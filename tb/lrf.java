package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.i;
import com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.a;
import com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.a;
import com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.b;
import tb.lmd;
import tb.lmh;
import tb.lmi;
import tb.lml;
import tb.lsb;
import tb.qnm;

/* loaded from: classes.dex */
public class lrf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-7203347);
    }

    @Deprecated
    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{dinamicXEngine});
        } else {
            a(dinamicXEngine, null);
        }
    }

    public static void a(DinamicXEngine dinamicXEngine, ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f32fc434", new Object[]{dinamicXEngine, ljsVar});
        } else if (dinamicXEngine == null) {
            ldf.e("TbRecommendDxRegister", "dx3BaseRegister dxEngine == null");
        } else {
            a.a(dinamicXEngine);
            lpo.a(dinamicXEngine);
            lod.a(dinamicXEngine);
            dinamicXEngine.a(com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.a.DXHVIDEOANIMATIONLAYOUT_HVIDEOANIMATIONLAYOUT, new a.C0671a());
            dinamicXEngine.a(b.DXHVIDEOANIMATION_HVIDEOANIMATION, new b.a());
            if (i.b()) {
                dinamicXEngine.a(-8690577844899785500L, new lmh.a());
            } else {
                dinamicXEngine.a(-8690577844899785500L, new lmi.a());
            }
            if (qno.c()) {
                ldf.d("TbRecommendDxRegister", "直播组件降级到图片");
                dinamicXEngine.a(-5996311416603680075L, new qnm.a());
            } else {
                ldf.d("TbRecommendDxRegister", "加载真实直播组件");
                dinamicXEngine.a(-5996311416603680075L, new lml.a());
            }
            try {
                lmr.a(dinamicXEngine);
            } catch (Throwable th) {
                ldf.a("TbRecommendDxRegister", "AdD3Register.initFowAdDX error", th);
            }
            dinamicXEngine.a(lsb.HREMINDSUBSCRIBE, new lsb.a());
            dinamicXEngine.a(4912396181747440332L, new lmd.a());
            lqp.a(dinamicXEngine);
            dinamicXEngine.a(com.taobao.infoflow.taobao.subservice.biz.iconbackanimeservice.a.DX_PARSER_HICONPAGENUM, new lfo(new com.taobao.infoflow.taobao.subservice.biz.iconbackanimeservice.a()));
        }
    }
}
