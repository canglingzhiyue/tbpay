package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.c;
import java.io.Serializable;
import java.util.List;

@AURAExtensionImpl(code = "alidetail.impl.maingallery.switcher")
/* loaded from: classes4.dex */
public final class elk extends arn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f27400a = "AliSDetailMainGallerySwitchExtension";
    private final String b = "industryMainPic";
    private final String c = "detailHeaderPic";
    private final String d = "picGallery";
    private final String e = "headerPic";

    static {
        kge.a(-146389931);
    }

    public static /* synthetic */ Object ipc$super(elk elkVar, String str, Object... objArr) {
        if (str.hashCode() == -362309544) {
            super.beforeServiceExecute((AURAInputData) objArr[0], (a) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public elk() {
        emu.a("com.taobao.android.detail.core.standard.mainscreen.AliSDetailMainGallerySwitchExtension");
    }

    @Override // tb.arn, tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, aVar);
        if (!com.alibaba.android.aura.service.parse.a.PARSE_SERVICE_CODE.equalsIgnoreCase(aVar.c())) {
            return;
        }
        Serializable data = aURAInputData.getData();
        if (!(data instanceof AURAParseIO)) {
            ema.a("protocolInValid#wrongTypeNotAURAParseIO", "data is wrong type, not AURAParseIO,data=" + data, a(), d());
            return;
        }
        List<com.alibaba.android.aura.datamodel.parse.a> data2 = ((AURAParseIO) data).getData();
        if (bau.a(data2)) {
            ema.a("protocolInValid#protocolIsEmpty", "protocolModelList is empty", a(), d());
            return;
        }
        JSONObject a2 = data2.get(0).a();
        if (a2 == null) {
            ema.a("protocolInValid#protocolIsEmpty", "protocol is null", a(), d());
            return;
        }
        elw elwVar = new elw(a2);
        JSONArray a3 = elwVar.a("detailHeaderPic");
        if (a3 == null) {
            ema.a("protocolInValid#doNotContainDetailHeaderPic", "detailHeaderPic is null", a(), d());
            return;
        }
        String b = elwVar.b("industryMainPic");
        boolean parseBoolean = Boolean.parseBoolean(b);
        ard a4 = arc.a();
        a4.a("AliSDetailMainGallerySwitchExtension", "beforeServiceExecute", "industryMainPic=" + b);
        if (parseBoolean) {
            a3.remove("picGallery");
        } else {
            a3.remove("headerPic");
        }
        if (a3.size() != 0) {
            return;
        }
        ema.a("protocolInValid#headerNodeIsZero", "header node count is zero", a(), d());
        c.a(a().e());
    }
}
