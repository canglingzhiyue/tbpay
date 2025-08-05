package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.alipay.ma.analyze.api.MaAnalyzeAPI;
import com.alipay.ma.decode.DecodeResult;
import com.alipay.ma.decode.DecodeType;
import com.alipay.ma.decode.MaDecode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.scancode.gateway.util.o;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.MaType;
import com.taobao.taobao.scancode.v2.result.a;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class oyi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, oyp> f32491a;

    private static boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{new Integer(i), new Integer(i2)})).booleanValue() : (i & i2) == i2;
    }

    public static MaResult[] a(YuvImage yuvImage, Rect rect, MaType... maTypeArr) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (MaResult[]) ipChange.ipc$dispatch("57a4a7ee", new Object[]{yuvImage, rect, maTypeArr});
        }
        DecodeType[] a2 = a(maTypeArr);
        long currentTimeMillis = System.currentTimeMillis();
        DecodeResult[] decode = MaAnalyzeAPI.decode(yuvImage, rect, a2);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (decode == null || decode.length == 0) {
            z = false;
        }
        return a(currentTimeMillis2, z, decode, false);
    }

    public static MaResult[] a(Bitmap bitmap, int i, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (MaResult[]) ipChange.ipc$dispatch("86aa6c04", new Object[]{bitmap, new Integer(i), new Boolean(z)});
        }
        int a2 = a(i);
        long currentTimeMillis = System.currentTimeMillis();
        DecodeResult[] decode = MaAnalyzeAPI.decode(bitmap, a2, false, z);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        String str = "decodeInBatch: costTime = " + currentTimeMillis2;
        if (decode == null || decode.length == 0) {
            z2 = false;
        }
        return a(currentTimeMillis2, z2, decode, z);
    }

    private static MaResult[] a(long j, boolean z, DecodeResult[] decodeResultArr, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult[]) ipChange.ipc$dispatch("b5760f23", new Object[]{new Long(j), new Boolean(z), decodeResultArr, new Boolean(z2)});
        }
        oxt.a("decode", j, z, z2);
        if (!z) {
            return null;
        }
        ArrayList arrayList = new ArrayList(decodeResultArr.length);
        for (DecodeResult decodeResult : decodeResultArr) {
            MaResult a2 = a(decodeResult);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (!arrayList.isEmpty()) {
            return (MaResult[]) arrayList.toArray(new MaResult[arrayList.size()]);
        }
        return null;
    }

    public static MaResult a(String str, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("dfba7b", new Object[]{str, new Integer(i)});
        }
        int a2 = a(i);
        long currentTimeMillis = System.currentTimeMillis();
        DecodeResult[] decode = MaAnalyzeAPI.decode(str, Globals.getApplication(), a2);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        String str2 = "decode: path = " + str + "costTime = " + currentTimeMillis2;
        if (decode == null) {
            z = false;
        }
        oxt.a("decode", currentTimeMillis2, z);
        return a(decode);
    }

    public static MaResult a(String str, int i, Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("51526c1", new Object[]{str, new Integer(i), context});
        }
        int a2 = a(i);
        long currentTimeMillis = System.currentTimeMillis();
        DecodeResult[] decode = MaAnalyzeAPI.decode(str, context, a2);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        String str2 = "decode: uri = " + str + ", costTime = " + currentTimeMillis2;
        if (decode == null) {
            z = false;
        }
        oxt.a("decode", currentTimeMillis2, z);
        return a(decode);
    }

    public static MaResult a(Bitmap bitmap, MaType... maTypeArr) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("1232f938", new Object[]{bitmap, maTypeArr});
        }
        if (bitmap == null) {
            return null;
        }
        int i = 0;
        for (DecodeType decodeType : a(maTypeArr)) {
            i |= decodeType.getCodeType();
        }
        long currentTimeMillis = System.currentTimeMillis();
        DecodeResult[] codeDecodePictureWithQr = MaDecode.codeDecodePictureWithQr(bitmap, i, false);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        String str = "decode: uri = , costTime = " + currentTimeMillis2;
        if (codeDecodePictureWithQr == null) {
            z = false;
        }
        oxt.a("decode", currentTimeMillis2, z);
        return a(codeDecodePictureWithQr);
    }

    private static int a(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 36607) {
            return DecodeType.ALLQRCODE.getCodeType() | DecodeType.ALLBARCODE.getCodeType();
        }
        if (a(i, 2)) {
            i2 = 0 | DecodeType.EXPRESS.getCodeType();
        }
        if (a(i, 1)) {
            i2 |= DecodeType.EAN13.getCodeType();
        }
        if (a(i, 2)) {
            i2 |= DecodeType.EAN8.getCodeType();
        }
        if (a(i, 4)) {
            i2 |= DecodeType.UPCA.getCodeType();
        }
        if (a(i, 8)) {
            i2 |= DecodeType.UPCE.getCodeType();
        }
        if (a(i, 2)) {
            i2 |= DecodeType.EAN8.getCodeType();
        }
        if (a(i, 128)) {
            i2 |= DecodeType.EAN14.getCodeType();
        }
        if (a(i, 16)) {
            i2 |= DecodeType.CODE39.getCodeType();
        }
        if (a(i, 64)) {
            i2 |= DecodeType.ITF.getCodeType();
        }
        if (a(i, 48)) {
            i2 |= DecodeType.FASTMAIL.getCodeType();
        }
        if (a(i, 255)) {
            i2 |= DecodeType.ONECODE.getCodeType();
        }
        if (a(i, 512)) {
            i2 |= DecodeType.QRCODE.getCodeType();
        }
        return a(i, 1024) ? i2 | DecodeType.DMCODE.getCodeType() : i2;
    }

    private static MaResult a(DecodeResult decodeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("d779b1db", new Object[]{decodeResult});
        }
        if (decodeResult == null) {
            return null;
        }
        o.a("MaDecodeV2_get result:" + decodeResult.resultMaType + decodeResult.toString(), new Object[0]);
        MaResult a2 = a(b(decodeResult));
        if (a2 == null) {
            o.b("MaDecodeV2 has decode result but no parse data", new Object[0]);
            return null;
        }
        o.a("MaDecodeV2_transform to biz result :" + a2.toString(), new Object[0]);
        return a2;
    }

    private static MaResult a(DecodeResult[] decodeResultArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("e1dc31b6", new Object[]{decodeResultArr});
        }
        if (decodeResultArr != null && decodeResultArr.length != 0) {
            return a(decodeResultArr[0]);
        }
        return null;
    }

    static {
        kge.a(-1913778790);
        f32491a = new HashMap<>();
    }

    public static MaResult a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("acc4db6", new Object[]{aVar});
        }
        if (f32491a.isEmpty()) {
            f32491a.put(oym.class.getName(), new oym());
            f32491a.put(oyq.class.getName(), new oyq());
            f32491a.put(oyr.class.getName(), new oyr());
            f32491a.put(oyo.class.getName(), new oyo());
        }
        for (String str : f32491a.keySet()) {
            MaResult a2 = f32491a.get(str).a(aVar);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    private static DecodeType[] a(MaType[] maTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecodeType[]) ipChange.ipc$dispatch("6660c68d", new Object[]{maTypeArr});
        }
        if (maTypeArr == null || maTypeArr.length == 0) {
            return new DecodeType[0];
        }
        ArrayList arrayList = new ArrayList();
        for (MaType maType : maTypeArr) {
            switch (maType) {
                case QR:
                    arrayList.add(DecodeType.QRCODE);
                    break;
                case DM:
                    arrayList.add(DecodeType.DMCODE);
                    break;
                case EXPRESS:
                    arrayList.add(DecodeType.EXPRESS);
                    break;
                case PRODUCT:
                    arrayList.add(DecodeType.PRODUCT);
                    break;
                case MEDICINE:
                    arrayList.add(DecodeType.MEDICINE);
                    break;
                case TB_ANTI_FAKE:
                    arrayList.add(DecodeType.MEDICINE);
                    break;
            }
        }
        return (DecodeType[]) arrayList.toArray(new DecodeType[0]);
    }

    private static a b(DecodeResult decodeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4553e0ea", new Object[]{decodeResult});
        }
        a aVar = new a();
        aVar.f21289a = decodeResult.type;
        aVar.b = decodeResult.subType;
        aVar.c = decodeResult.strCode;
        aVar.d = decodeResult.decodeBytes;
        aVar.e = decodeResult.hiddenData;
        aVar.g = decodeResult.x;
        aVar.h = decodeResult.y;
        aVar.i = decodeResult.width;
        aVar.j = decodeResult.height;
        aVar.k = decodeResult.xCorner;
        aVar.l = decodeResult.yCorner;
        aVar.f = oyl.a(aVar);
        return aVar;
    }
}
