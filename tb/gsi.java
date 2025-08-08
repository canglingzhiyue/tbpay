package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.net.URLEncoder;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class gsi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UTF_8 = "UTF-8";

    static {
        kge.a(-855412484);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (Exception e) {
            Log.e("EncodeUTF8", "encode err " + e.getMessage());
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static byte[] b(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gsi.b(java.lang.String):byte[]");
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        try {
            return new String(Base64.encode(bArr, 11), "UTF-8");
        } catch (Throwable th) {
            Log.e("encodeByteToBase64", "encode bytes to base64 err " + th.getMessage());
            return "";
        }
    }

    public static String b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47058030", new Object[]{bArr});
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 32);
            StringBuilder sb = new StringBuilder();
            byte[] bArr2 = new byte[32];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read != -1) {
                    sb.append(new String(bArr2, 0, read));
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return sb.toString();
                }
            }
        } catch (Throwable th) {
            Log.e("EncodeUTF8", "encode err " + th.getMessage());
            return "";
        }
    }

    public static JSONObject c(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f9db8da2", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String b = b(Base64.decode(str, 0));
            if (!StringUtils.isEmpty(b) && (split = b.split("\n")) != null && split.length > 0) {
                for (String str2 : split) {
                    String[] split2 = str2.split("=", 2);
                    if (split2 != null && split2.length == 2) {
                        jSONObject.put(split2[0], new JSONObject(split2[1]));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }
}
