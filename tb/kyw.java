package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.kzr;
import tb.kzs;
import tb.kzt;

/* loaded from: classes.dex */
public class kyw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{dinamicXEngine});
            return;
        }
        b(dinamicXEngine);
        c(dinamicXEngine);
        d(dinamicXEngine);
    }

    private static void b(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e2379a", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.a(kzr.DXHANIMATORIMAGEVIEW_HANIMATORIMAGEVIEW, new kzr.a());
        dinamicXEngine.a(kzs.DXSTRIKEFRAMELAYOUT_STRIKEFRAMELAYOUT, new kzs.a());
        dinamicXEngine.a(kzt.DXTBPOPEVENTLAYOUT_TBPOPEVENTLAYOUT, new kzt.a());
    }

    private static void c(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("366bd19b", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.a(kzd.DX_EVENT_POPCANCEL, new kzd());
        dinamicXEngine.a(kzf.DX_EVENT_POPCONFIRM, new kzf());
        dinamicXEngine.a(kze.DX_EVENT_POPCLICK, new kze());
        dinamicXEngine.a(kyz.DX_EVENT_HEXPOSEEVENT, new kyz());
        dinamicXEngine.a(kzh.DX_EVENT_POPTRIGGER, new kzh());
        dinamicXEngine.a(kyy.DX_EVENT_HEVENTGROUP, new kyy());
        dinamicXEngine.a(kza.DX_EVENT_HSETPOPCLIENTPARAMS, new kza());
        dinamicXEngine.a(kzc.DX_EVENT_HSETTOSTATICCACHE, new kzc());
        dinamicXEngine.a(kzg.DX_EVENT_POPMESSAGE, new kzg());
        dinamicXEngine.a(kzi.DX_EVENT_SETCARDMODELEXTEVENTHANDER, new kzi());
    }

    private static void d(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f56b9c", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.a(kzk.DX_PARSER_GETARROWSPOINT, new kzk());
        dinamicXEngine.a(kzm.DX_PARSER_HGETFROMSTATICCACHE, new kzm());
        dinamicXEngine.a(kzo.DX_PARSER_POPFETCHVIEWFRAME, new kzo());
        dinamicXEngine.a(-2517623531547489759L, new kzp());
        dinamicXEngine.a(kzn.DX_PARSER_HGETSEARCHBARHEIGHT, new kzn());
        dinamicXEngine.a(str.DX_PARSER_POPANCHORFRAME, new str());
    }
}
