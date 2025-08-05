package tb;

import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.comprehension.f;
import java.util.ArrayList;
import java.util.List;
import tb.nec;

/* loaded from: classes.dex */
public class neb {
    public static final List<nec> ALL_EXTENSION_TYPES;
    public static final nec APNG;
    public static final nec AVIF;
    public static final nec BMP;
    public static final nec GIF;
    public static final nec HEIF;
    public static final nec JPEG;
    public static final nec PNG;
    public static final nec PNG_A;
    public static final nec WEBP;
    public static final nec WEBP_A;

    static {
        kge.a(1673911766);
        JPEG = new nec("JPEG", "JPEG", new String[]{f.FILE_TYPE_IMAGE_JPG, BlobManager.UPLOAD_IMAGE_TYPE_JPEG}, new nec.a() { // from class: tb.neb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nec.a
            public boolean a(byte[] bArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{this, bArr})).booleanValue() : ned.a(bArr);
            }
        });
        WEBP = new nec("WEBP", "WEBP", new String[]{BlobManager.UPLOAD_IMAGE_TYPE_WEBP}, new nec.a() { // from class: tb.neb.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nec.a
            public boolean a(byte[] bArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{this, bArr})).booleanValue() : ned.b(bArr);
            }
        });
        WEBP_A = new nec("WEBP", "WEBP_A", new String[]{BlobManager.UPLOAD_IMAGE_TYPE_WEBP}, true, new nec.a() { // from class: tb.neb.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nec.a
            public boolean a(byte[] bArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{this, bArr})).booleanValue() : ned.c(bArr);
            }
        });
        PNG = new nec("PNG", "PNG", new String[]{"png"}, new nec.a() { // from class: tb.neb.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nec.a
            public boolean a(byte[] bArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{this, bArr})).booleanValue() : ned.e(bArr);
            }
        });
        PNG_A = new nec("PNG", "PNG_A", new String[]{"png"}, true, new nec.a() { // from class: tb.neb.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nec.a
            public boolean a(byte[] bArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{this, bArr})).booleanValue() : ned.f(bArr);
            }
        });
        GIF = new nec("GIF", "GIF", true, new String[]{kin.GIF_MODE}, new nec.a() { // from class: tb.neb.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nec.a
            public boolean a(byte[] bArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{this, bArr})).booleanValue() : ned.d(bArr);
            }
        });
        BMP = new nec("BMP", "BMP", new String[]{"bmp"}, new nec.a() { // from class: tb.neb.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nec.a
            public boolean a(byte[] bArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{this, bArr})).booleanValue() : ned.g(bArr);
            }
        });
        HEIF = new nec("HEIF", "HEIF", new String[]{"heic"}, new nec.a() { // from class: tb.neb.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nec.a
            public boolean a(byte[] bArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{this, bArr})).booleanValue() : ned.h(bArr);
            }
        });
        AVIF = new nec("AVIF", "AVIF", new String[]{"avif"}, new nec.a() { // from class: tb.neb.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nec.a
            public boolean a(byte[] bArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{this, bArr})).booleanValue() : ned.i(bArr);
            }
        });
        APNG = new nec("PNG", "apng", true, new String[]{"png"}, new nec.a() { // from class: tb.neb.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nec.a
            public boolean a(byte[] bArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{this, bArr})).booleanValue() : bArr != null && bArr.length >= 41 && ned.a(bArr, 0, ned.PNG_HEADER) && ned.j(bArr);
            }
        });
        ArrayList arrayList = new ArrayList();
        ALL_EXTENSION_TYPES = arrayList;
        arrayList.add(JPEG);
        ALL_EXTENSION_TYPES.add(WEBP);
        ALL_EXTENSION_TYPES.add(PNG);
        ALL_EXTENSION_TYPES.add(GIF);
        ALL_EXTENSION_TYPES.add(BMP);
    }
}
