package anet.channel.encode;

import android.os.Build;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.PublicNetworkErrorStatistic;
import anet.channel.statist.ZstdLinkStatistic;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.dispatch.DispatchHelper;
import anet.channel.strategy.dispatch.DispatchZstdDictEvent;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.TlsSniSocketFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.ZstdStreamInflater;
import com.android.taobao.zstd.b;
import com.android.taobao.zstd.dict.ZstdDecompressDict;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.weex_framework.util.a;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import tb.kge;

/* loaded from: classes2.dex */
public class ZstdResponseHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_RETRY = 1;
    private static final String TAG = "awcn.ZstdResponseHeader";
    private String contentEncodeType = null;
    public UseAsDictionary useAsDictionary = null;
    public LatestDictionary latestDictionary = null;

    /* loaded from: classes2.dex */
    public class LatestDictionary {
        public String link = null;
        public String hash_algo = "sha-256";
        public String hash = null;

        static {
            kge.a(2019256303);
        }

        public LatestDictionary() {
        }
    }

    /* loaded from: classes2.dex */
    public class UseAsDictionary {
        public String matchPath = null;
        public long ttl = 31536000;
        public String dictType = a.ATOM_raw;
        public String hashes = "sha-256";

        static {
            kge.a(349530845);
        }

        public UseAsDictionary() {
        }
    }

    static {
        kge.a(1649973778);
    }

    public static /* synthetic */ int access$000(ZstdResponseHelper zstdResponseHelper, List list, URL url, boolean z, long j, String str, String str2, int i, boolean z2, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("55dbd09e", new Object[]{zstdResponseHelper, list, url, new Boolean(z), new Long(j), str, str2, new Integer(i), new Boolean(z2), new Long(j2)})).intValue() : zstdResponseHelper.sendOneDictUrl(list, url, z, j, str, str2, i, z2, j2);
    }

    public static Pair<b, Pair<ZstdDecompressDict, ZstdStreamInflater>> getZstdInputStream(InputStream inputStream, DispatchZstdDictEvent dispatchZstdDictEvent, int i, PublicNetworkErrorStatistic publicNetworkErrorStatistic, String str) {
        Pair<b, Pair<ZstdDecompressDict, ZstdStreamInflater>> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("60398e4a", new Object[]{inputStream, dispatchZstdDictEvent, new Integer(i), publicNetworkErrorStatistic, str});
        }
        if (dispatchZstdDictEvent == null) {
            return null;
        }
        try {
            ZstdResponseHelper parseZstdResponseHeader = new ZstdResponseHelper().parseZstdResponseHeader(dispatchZstdDictEvent.urlKey, dispatchZstdDictEvent.contentEncodeStr, dispatchZstdDictEvent.useAsDictionaryStr, dispatchZstdDictEvent.LatestDictionaryStr, str);
            if (parseZstdResponseHeader != null) {
                byte[] dictionary = parseZstdResponseHeader.getDictionary(dispatchZstdDictEvent.urlKey, str);
                if (!EncodingHelper.isZstdValid() || !AwcnConfig.isZstdDictDecompressOpened() || dictionary == null) {
                    pair = null;
                } else {
                    pair = EncodingHelper.getZstdDictInputStream(dictionary, inputStream, str);
                    publicNetworkErrorStatistic.strArg1 = "real_zstd-d";
                    ALog.e(TAG, "[zstd-d] getZstdInputStream zstd dict decompress get inputStream success!", str, new Object[0]);
                }
                parseZstdResponseHeader.dueToLinkDictionary(dispatchZstdDictEvent.urlKey, str);
                return pair;
            }
        } catch (Exception e) {
            ALog.e(TAG, "[zstd-d] getZstdInputStream error=" + e.toString(), str, new Object[0]);
        }
        return null;
    }

    public static Pair<b, Pair<ZstdDecompressDict, ZstdStreamInflater>> getZstdMtopInputStream(InputStream inputStream, DispatchZstdDictEvent dispatchZstdDictEvent, ZstdResponseHelper zstdResponseHelper, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c1ee1e40", new Object[]{inputStream, dispatchZstdDictEvent, zstdResponseHelper, str});
        }
        if (zstdResponseHelper != null && dispatchZstdDictEvent != null) {
            try {
                byte[] dictionary = zstdResponseHelper.getDictionary(dispatchZstdDictEvent.urlKey, str);
                if (!EncodingHelper.isZstdValid() || !AwcnConfig.isZstdDictDecompressOpened() || dictionary == null) {
                    return null;
                }
                Pair<b, Pair<ZstdDecompressDict, ZstdStreamInflater>> zstdDictInputStream = EncodingHelper.getZstdDictInputStream(dictionary, inputStream, str);
                ALog.e(TAG, "[zstd-d] getZstdMtopInputStream zstd dict decompress get inputStream success!", str, new Object[0]);
                return zstdDictInputStream;
            } catch (Exception e) {
                ALog.e(TAG, "[zstd-d] getZstdMtopInputStream error=" + e.toString(), str, new Object[0]);
            }
        }
        return null;
    }

    public ZstdResponseHelper parseZstdResponseHeader(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZstdResponseHelper) ipChange.ipc$dispatch("9f9a1410", new Object[]{this, str, str2, str3, str4, str5});
        }
        if (str2 == null || str2.isEmpty() || !str2.contains("zstd-d")) {
            ALog.e(TAG, "[zstd-d] parseZstdResponseHeader contentEncode not zstd-d", str5, "contentEncode=", str2);
        } else {
            this.contentEncodeType = "zstd-d";
            ALog.e(TAG, "[zstd-d] parseZstdResponseHeader contentEncode is zstd", str5, new Object[0]);
        }
        if (str3 != null && !str3.isEmpty()) {
            parseUseAsDictionary(str3, str5);
            ZstdDictHelper.updateMatchPath(this.useAsDictionary, str, str5);
        }
        if (str4 != null && !str4.isEmpty()) {
            parseLatestDictionary(str4, str5);
        }
        return this;
    }

    public byte[] getDictionary(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("de0e716", new Object[]{this, str, str2});
        }
        String str3 = this.contentEncodeType;
        if (str3 == null || !"zstd-d".equalsIgnoreCase(str3)) {
            ALog.e(TAG, "[zstd-d] getDictionary null, contentEncode is " + this.contentEncodeType, str2, new Object[0]);
            return null;
        }
        ZstdAttributes zstdAttributesByUrlKey = ZstdDictHelper.getZstdAttributesByUrlKey(str, str2);
        byte[] dictByUrlKey = ZstdDictHelper.getDictByUrlKey(str, ZstdDictHelper.getDictKeyByZstdAttributes(str, zstdAttributesByUrlKey, str2), str2);
        if (zstdAttributesByUrlKey != null) {
            zstdAttributesByUrlKey.setCanUpdate(true);
        }
        if (dictByUrlKey != null && dictByUrlKey.length != 0) {
            return dictByUrlKey;
        }
        ALog.e(TAG, "[zstd-d] dueToDictionary null,urlKey=" + str, str2, new Object[0]);
        return null;
    }

    public void dueToLinkDictionary(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55408cba", new Object[]{this, str, str2});
        } else {
            ThreadPoolExecutorFactory.submitDownloaderExecutorTask(new Runnable() { // from class: anet.channel.encode.ZstdResponseHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    boolean z;
                    String str3 = "https";
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (!ZstdDictHelper.isCanUpdate(str, str2)) {
                            ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary not allow update ", str2, new Object[0]);
                            return;
                        }
                        ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary first download or dict use finish, can update", str2, new Object[0]);
                        if (ZstdResponseHelper.this.latestDictionary != null && ZstdResponseHelper.this.useAsDictionary != null) {
                            long j = ZstdResponseHelper.this.useAsDictionary.ttl;
                            ZstdAttributes zstdAttributesByUrlKey = ZstdDictHelper.getZstdAttributesByUrlKey(str, str2);
                            long currentTimeMillis = System.currentTimeMillis();
                            if (zstdAttributesByUrlKey != null && zstdAttributesByUrlKey.lastZstdLinkDictTime != -1 && currentTimeMillis - zstdAttributesByUrlKey.lastZstdLinkDictTime < AwcnConfig.getZstdLinkDictIntervalTime()) {
                                ALog.e(ZstdResponseHelper.TAG, "[zstd-d] not allow dueToLinkDictionary!", str2, "urlKey", str, "intervalTime", Long.valueOf(currentTimeMillis - zstdAttributesByUrlKey.lastZstdLinkDictTime));
                                return;
                            }
                            String str4 = null;
                            if (zstdAttributesByUrlKey != null) {
                                zstdAttributesByUrlKey.setTtl(j);
                                str4 = ZstdDictHelper.getDictKeyByZstdAttributes(str, zstdAttributesByUrlKey, str2);
                            }
                            if (str4 != null && !str4.isEmpty()) {
                                z = false;
                                boolean z2 = z && !str4.equalsIgnoreCase(ZstdResponseHelper.this.latestDictionary.hash);
                                if (ZstdResponseHelper.this.latestDictionary.link != null || ZstdResponseHelper.this.latestDictionary.link.isEmpty() || (!z && !z2)) {
                                    ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary not need update", str2, new Object[0]);
                                    return;
                                }
                                if (zstdAttributesByUrlKey != null) {
                                    zstdAttributesByUrlKey.lastZstdLinkDictTime = currentTimeMillis;
                                }
                                ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary need update", str2, new Object[0]);
                                boolean startsWith = ZstdResponseHelper.this.latestDictionary.link.startsWith(str3);
                                URL url = new URL(ZstdResponseHelper.this.latestDictionary.link);
                                if (!startsWith) {
                                    str3 = "http";
                                }
                                String host = url.getHost();
                                List<IConnStrategy> prepareConnStrategy = DispatchHelper.prepareConnStrategy(str3, host);
                                ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary get strategies: host=" + host, str2, "strategies", prepareConnStrategy);
                                long currentTimeMillis2 = System.currentTimeMillis();
                                int i = 0;
                                while (i <= 1) {
                                    int i2 = i;
                                    URL url2 = url;
                                    if (ZstdResponseHelper.access$000(ZstdResponseHelper.this, prepareConnStrategy, url, z2, j, str2, str, i2, startsWith, currentTimeMillis2) != 0) {
                                        ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary sendOneDictUrl break retry=" + i2, str2, new Object[0]);
                                        return;
                                    }
                                    i = i2 + 1;
                                    url = url2;
                                }
                                return;
                            }
                            z = true;
                            if (z) {
                            }
                            if (ZstdResponseHelper.this.latestDictionary.link != null) {
                            }
                            ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary not need update", str2, new Object[0]);
                            return;
                        }
                        ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary  null", str2, new Object[0]);
                    } catch (Exception e) {
                        ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary  error=" + e.toString(), str2, new Object[0]);
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0411, code lost:
        anet.channel.encode.FileHelper.deleteDirectory(anet.channel.encode.FileHelper.getDefaultFilePath(r40, anet.channel.encode.FileHelper.DEFAULT_TEMPORARY_PATH, anet.channel.encode.FileHelper.ZSTD_TAG), r40, anet.channel.encode.FileHelper.ZSTD_TAG);
        r13.updateMsg = "update_over_dictPerMaxLength";
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x041f, code lost:
        r1 = null;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0506, code lost:
        r1 = anet.channel.util.StringUtils.bytesToHexString(r1.digest());
        r13.updateMsg = "update_hash";
        anet.channel.util.ALog.e(anet.channel.encode.ZstdResponseHelper.TAG, "[zstd-d] sendOneDictUrl hashStr=" + r1, r40, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x052a, code lost:
        r25 = r2;
        r11 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0648 A[Catch: IOException -> 0x0644, TRY_LEAVE, TryCatch #191 {IOException -> 0x0644, blocks: (B:311:0x0640, B:314:0x0648), top: B:780:0x0640 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d A[Catch: all -> 0x00bf, Exception -> 0x00c5, IOException -> 0x00cd, CancellationException -> 0x00d7, SSLException -> 0x00e1, SSLHandshakeException -> 0x00ed, ConnectException -> 0x00fb, ConnectTimeoutException -> 0x0105, SocketTimeoutException -> 0x010f, UnknownHostException -> 0x0119, TRY_ENTER, TryCatch #175 {SSLHandshakeException -> 0x00ed, SSLException -> 0x00e1, Exception -> 0x00c5, blocks: (B:41:0x0127, B:43:0x012d, B:48:0x013d, B:51:0x01c4), top: B:789:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c4 A[Catch: all -> 0x00bf, Exception -> 0x00c5, IOException -> 0x00cd, CancellationException -> 0x00d7, SSLException -> 0x00e1, SSLHandshakeException -> 0x00ed, ConnectException -> 0x00fb, ConnectTimeoutException -> 0x0105, SocketTimeoutException -> 0x010f, UnknownHostException -> 0x0119, TRY_LEAVE, TryCatch #175 {SSLHandshakeException -> 0x00ed, SSLException -> 0x00e1, Exception -> 0x00c5, blocks: (B:41:0x0127, B:43:0x012d, B:48:0x013d, B:51:0x01c4), top: B:789:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0a1c A[Catch: all -> 0x0a9f, TryCatch #55 {all -> 0x0a9f, blocks: (B:598:0x0a16, B:600:0x0a1c, B:602:0x0a23, B:604:0x0a2d, B:605:0x0a3a, B:621:0x0ab1, B:635:0x0b19, B:685:0x0cbd, B:699:0x0d25, B:713:0x0d8c, B:728:0x0df3), top: B:759:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0a2d A[Catch: all -> 0x0a9f, TryCatch #55 {all -> 0x0a9f, blocks: (B:598:0x0a16, B:600:0x0a1c, B:602:0x0a23, B:604:0x0a2d, B:605:0x0a3a, B:621:0x0ab1, B:635:0x0b19, B:685:0x0cbd, B:699:0x0d25, B:713:0x0d8c, B:728:0x0df3), top: B:759:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0a86  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0a93 A[Catch: IOException -> 0x0a8f, TRY_LEAVE, TryCatch #173 {IOException -> 0x0a8f, blocks: (B:609:0x0a8b, B:612:0x0a93), top: B:778:0x0a8b }] */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0aff A[Catch: IOException -> 0x0afb, TRY_LEAVE, TryCatch #123 {IOException -> 0x0afb, blocks: (B:625:0x0af7, B:628:0x0aff), top: B:773:0x0af7 }] */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0b5a  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0b67 A[Catch: IOException -> 0x0b63, TRY_LEAVE, TryCatch #109 {IOException -> 0x0b63, blocks: (B:639:0x0b5f, B:642:0x0b67), top: B:769:0x0b5f }] */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0bbc A[Catch: all -> 0x0ca7, TryCatch #63 {all -> 0x0ca7, blocks: (B:649:0x0b82, B:651:0x0bbc, B:652:0x0bde, B:665:0x0c1c, B:667:0x0c58, B:668:0x0c78), top: B:762:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0bf4  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0c01 A[Catch: IOException -> 0x0bfd, TRY_LEAVE, TryCatch #12 {IOException -> 0x0bfd, blocks: (B:656:0x0bf9, B:659:0x0c01), top: B:751:0x0bf9 }] */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0c58 A[Catch: all -> 0x0ca7, TryCatch #63 {all -> 0x0ca7, blocks: (B:649:0x0b82, B:651:0x0bbc, B:652:0x0bde, B:665:0x0c1c, B:667:0x0c58, B:668:0x0c78), top: B:762:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0c8e  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x0c9b A[Catch: IOException -> 0x0c97, TRY_LEAVE, TryCatch #171 {IOException -> 0x0c97, blocks: (B:672:0x0c93, B:675:0x0c9b), top: B:776:0x0c93 }] */
    /* JADX WARN: Removed duplicated region for block: B:687:0x0cfe  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x0d0b A[Catch: IOException -> 0x0d07, TRY_LEAVE, TryCatch #118 {IOException -> 0x0d07, blocks: (B:689:0x0d03, B:692:0x0d0b), top: B:771:0x0d03 }] */
    /* JADX WARN: Removed duplicated region for block: B:701:0x0d66  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x0d73 A[Catch: IOException -> 0x0d6f, TRY_LEAVE, TryCatch #65 {IOException -> 0x0d6f, blocks: (B:703:0x0d6b, B:706:0x0d73), top: B:765:0x0d6b }] */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0dcd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0204 A[Catch: Exception -> 0x0997, SSLException -> 0x099e, SSLHandshakeException -> 0x09a4, IOException -> 0x09aa, CancellationException -> 0x09b4, ConnectException -> 0x09d8, ConnectTimeoutException -> 0x09e2, SocketTimeoutException -> 0x09ec, UnknownHostException -> 0x09f6, all -> 0x0a00, TRY_ENTER, TRY_LEAVE, TryCatch #197 {all -> 0x0a00, blocks: (B:11:0x00ab, B:12:0x00af, B:61:0x01e4, B:71:0x0204, B:45:0x0134), top: B:759:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:720:0x0dda A[Catch: IOException -> 0x0dd6, TRY_LEAVE, TryCatch #40 {IOException -> 0x0dd6, blocks: (B:717:0x0dd2, B:720:0x0dda), top: B:753:0x0dd2 }] */
    /* JADX WARN: Removed duplicated region for block: B:730:0x0e34  */
    /* JADX WARN: Removed duplicated region for block: B:735:0x0e41 A[Catch: IOException -> 0x0e3d, TRY_LEAVE, TryCatch #194 {IOException -> 0x0e3d, blocks: (B:732:0x0e39, B:735:0x0e41), top: B:782:0x0e39 }] */
    /* JADX WARN: Removed duplicated region for block: B:740:0x0e4d  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x0e5a A[Catch: IOException -> 0x0e56, TRY_LEAVE, TryCatch #199 {IOException -> 0x0e56, blocks: (B:742:0x0e52, B:745:0x0e5a), top: B:785:0x0e52 }] */
    /* JADX WARN: Removed duplicated region for block: B:751:0x0bf9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:753:0x0dd2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:755:0x0238 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:765:0x0d6b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:769:0x0b5f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:771:0x0d03 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:773:0x0af7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:776:0x0c93 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:778:0x0a8b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:780:0x0640 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:782:0x0e39 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:785:0x0e52 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:797:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:826:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r11v161 */
    /* JADX WARN: Type inference failed for: r11v162 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v148 */
    /* JADX WARN: Type inference failed for: r12v156 */
    /* JADX WARN: Type inference failed for: r12v174 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v232 */
    /* JADX WARN: Type inference failed for: r12v235 */
    /* JADX WARN: Type inference failed for: r12v236 */
    /* JADX WARN: Type inference failed for: r12v237 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int sendOneDictUrl(java.util.List<anet.channel.strategy.IConnStrategy> r35, java.net.URL r36, boolean r37, long r38, java.lang.String r40, java.lang.String r41, int r42, boolean r43, long r44) {
        /*
            Method dump skipped, instructions count: 3684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.encode.ZstdResponseHelper.sendOneDictUrl(java.util.List, java.net.URL, boolean, long, java.lang.String, java.lang.String, int, boolean, long):int");
    }

    private static HttpURLConnection getHttpConnection(URL url, String str, String str2) {
        HttpURLConnection httpURLConnection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("54137669", new Object[]{url, str, str2});
        }
        try {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        } catch (Exception e) {
            e = e;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setRequestProperty(HttpConstant.HOST, str);
            httpURLConnection.setConnectTimeout(20000);
            httpURLConnection.setReadTimeout(20000);
        } catch (Exception e2) {
            e = e2;
            ALog.e(TAG, "[zstd-d] getHttpConnection, error=" + e.toString(), str2, new Object[0]);
            return httpURLConnection;
        }
        return httpURLConnection;
    }

    private static HttpsURLConnection getHttpsConnection(final URL url, final String str, final String str2) {
        HttpsURLConnection httpsURLConnection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpsURLConnection) ipChange.ipc$dispatch("ad107bc8", new Object[]{url, str, str2});
        }
        try {
            httpsURLConnection = (HttpsURLConnection) url.openConnection();
            try {
                httpsURLConnection.setRequestProperty(HttpConstant.HOST, str);
                httpsURLConnection.setConnectTimeout(20000);
                httpsURLConnection.setReadTimeout(20000);
            } catch (Exception e) {
                e = e;
                ALog.e(TAG, "[zstd-d] getHttpsConnection, error=" + e.toString(), str2, new Object[0]);
                return httpsURLConnection;
            }
        } catch (Exception e2) {
            e = e2;
            httpsURLConnection = null;
        }
        if (Integer.parseInt(Build.VERSION.SDK) < 8) {
            ALog.e(TAG, "[zstd-d] supportHttpsDictUrl 以下版本不支持https", str2, new Object[0]);
            return httpsURLConnection;
        }
        httpsURLConnection.setSSLSocketFactory(new TlsSniSocketFactory(str));
        httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: anet.channel.encode.ZstdResponseHelper.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str3, SSLSession sSLSession) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("563b2905", new Object[]{this, str3, sSLSession})).booleanValue();
                }
                ALog.e(ZstdResponseHelper.TAG, "[zstd-d] getHttpsConnection, host=" + str + " ,url=" + url.toString(), str2, new Object[0]);
                return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
            }
        });
        return httpsURLConnection;
    }

    private void commitErrorStatistic(ZstdLinkStatistic zstdLinkStatistic, int i, String str, String str2, int i2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3d526a0", new Object[]{this, zstdLinkStatistic, new Integer(i), str, str2, new Integer(i2), str3, str4});
        } else if ((i <= 0 && !str3.equalsIgnoreCase("1")) || zstdLinkStatistic == null) {
        } else {
            zstdLinkStatistic.updateMsg = "update" + str;
            zstdLinkStatistic.ret = str3;
            zstdLinkStatistic.errMsg = str2;
            zstdLinkStatistic.responseCode = i2;
            AppMonitor.getInstance().commitStat(zstdLinkStatistic);
            ALog.e(TAG, "[zstd-d] commitErrorStatistic send link pss=" + zstdLinkStatistic.toString(), str4, new Object[0]);
        }
    }

    private UseAsDictionary parseUseAsDictionary(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UseAsDictionary) ipChange.ipc$dispatch("f9d9b9f1", new Object[]{this, str, str2});
        }
        if (this.useAsDictionary == null) {
            this.useAsDictionary = new UseAsDictionary();
        }
        StringBuilder sb = new StringBuilder();
        for (String str3 : str.split(",")) {
            String[] split = str3.split("=");
            String trim = split[0].trim();
            String trim2 = split[1].trim();
            if (a.ATOM_EXT_match.equalsIgnoreCase(trim)) {
                this.useAsDictionary.matchPath = trim2.replace("\"", "");
                sb.append("[match]=");
                sb.append(this.useAsDictionary.matchPath);
            } else if (RemoteMessageConst.TTL.equalsIgnoreCase(trim)) {
                this.useAsDictionary.ttl = Long.parseLong(split[1]);
                sb.append(" ,[ttl]=");
                sb.append(this.useAsDictionary.ttl);
            } else if ("type".equalsIgnoreCase(trim)) {
                this.useAsDictionary.dictType = trim2.replace("\"", "");
                sb.append(" ,[dictType]=");
                sb.append(this.useAsDictionary.dictType);
            } else if ("hashes".equalsIgnoreCase(trim)) {
                this.useAsDictionary.hashes = split[1];
                sb.append(" ,[hashes]=");
                sb.append(this.useAsDictionary.hashes);
            }
        }
        ALog.e(TAG, "[zstd-d] parseUseAsDictionary msg= " + sb.toString(), str2, new Object[0]);
        return this.useAsDictionary;
    }

    private LatestDictionary parseLatestDictionary(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LatestDictionary) ipChange.ipc$dispatch("d491a98d", new Object[]{this, str, str2});
        }
        if (this.latestDictionary == null) {
            this.latestDictionary = new LatestDictionary();
        }
        StringBuilder sb = new StringBuilder();
        for (String str3 : str.split(",")) {
            String[] split = str3.split("=");
            String trim = split[0].trim();
            String trim2 = split[1].trim();
            if ("link".equalsIgnoreCase(trim)) {
                this.latestDictionary.link = trim2.replace("\"", "");
                sb.append("[link]=");
                sb.append(this.latestDictionary.link);
            } else if ("hash_algo".equalsIgnoreCase(trim)) {
                this.latestDictionary.hash_algo = trim2.replace("\"", "");
                sb.append(" ,[hash_algo]=");
                sb.append(this.latestDictionary.hash_algo);
            } else if ("hash".equalsIgnoreCase(trim)) {
                this.latestDictionary.hash = trim2.replace("\"", "");
                sb.append(" ,[hash]=");
                sb.append(this.latestDictionary.hash);
            }
        }
        ALog.e(TAG, "[zstd-d] parseLatestDictionary msg=" + sb.toString(), str2, new Object[0]);
        return this.latestDictionary;
    }
}
