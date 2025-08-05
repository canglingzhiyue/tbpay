package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class tof {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CHKSUMLEN = 8;
    public static final int GIDLEN = 8;
    public static final byte LF_BLK = 52;
    public static final byte LF_CHR = 51;
    public static final byte LF_CONTIG = 55;
    public static final byte LF_DIR = 53;
    public static final byte LF_FIFO = 54;
    public static final byte LF_LINK = 49;
    public static final byte LF_NORMAL = 48;
    public static final byte LF_OLDNORM = 0;
    public static final byte LF_SYMLINK = 50;
    public static final int MODELEN = 8;
    public static final int MODTIMELEN = 12;
    public static final int NAMELEN = 100;
    public static final int SIZELEN = 12;
    public static final int UIDLEN = 8;
    public static final int USTAR_DEVLEN = 8;
    public static final int USTAR_FILENAME_PREFIX = 155;
    public static final int USTAR_GROUP_NAMELEN = 32;
    public static final String USTAR_MAGIC = "ustar";
    public static final int USTAR_MAGICLEN = 8;
    public static final int USTAR_USER_NAMELEN = 32;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public int g;
    public byte h;
    public StringBuffer k;
    public StringBuffer l;
    public int m;
    public int n;
    public StringBuffer o;
    public StringBuffer j = new StringBuffer(USTAR_MAGIC);

    /* renamed from: a  reason: collision with root package name */
    public StringBuffer f34241a = new StringBuffer();
    public StringBuffer i = new StringBuffer();

    static {
        kge.a(-1487428853);
    }

    public tof() {
        String property = System.getProperty("user.name", "");
        property = property.length() > 31 ? property.substring(0, 31) : property;
        this.c = 0;
        this.d = 0;
        this.k = new StringBuffer(property);
        this.l = new StringBuffer("");
        this.o = new StringBuffer();
    }

    public static StringBuffer a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuffer) ipChange.ipc$dispatch("6a51cfd1", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        StringBuffer stringBuffer = new StringBuffer(i2);
        int i3 = i2 + i;
        while (i < i3 && bArr[i] != 0) {
            stringBuffer.append((char) bArr[i]);
            i++;
        }
        return stringBuffer;
    }
}
