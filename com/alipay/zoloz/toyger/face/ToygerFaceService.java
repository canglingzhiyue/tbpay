package com.alipay.zoloz.toyger.face;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.alipay.zoloz.image.ToygerImageUtil;
import com.alipay.zoloz.toyger.HandlerThreadPool;
import com.alipay.zoloz.toyger.ToygerBaseService;
import com.alipay.zoloz.toyger.ToygerCallback;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.algorithm.TGDepthFrame;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.algorithm.TGSensorFrame;
import com.alipay.zoloz.toyger.algorithm.Toyger;
import com.alipay.zoloz.toyger.algorithm.ToygerCameraConfig;
import com.alipay.zoloz.toyger.algorithm.ToygerConfig;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.riy;

/* loaded from: classes3.dex */
public class ToygerFaceService extends ToygerBaseService<ToygerFaceCallback, ToygerFaceState, ToygerFaceAttr, ToygerFaceInfo, ToygerFaceAlgorithmConfig> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_TOYGER_ACTION_TYPE = "toyger_action";
    public static final String KEY_TOYGER_DEPTH_FRAME = "toyger_depth_frame";
    public static final String KEY_TOYGER_FRAME = "toyger_frame";
    public static final String KEY_TOYGER_TIME_CONSUMING = "toygerTimeConsuming";
    public static final String KEY_TOYGER_UID = "uid";
    public static final int TOYGER_EVENT_INTERRUPT = 1;
    public static final int TOYGER_EVENT_RESUME = 2;
    public static int b = 0;
    public static int c = 1;
    private static byte[] f;
    private static String g;
    private ToygerConfig J;
    private FaceBlobManager e;
    private ByteBuffer k;
    private ByteBuffer l;
    private ByteBuffer m;
    private ToygerRunnable y;
    private static Boolean h = false;
    private static long N = 0;
    private static long O = 0;
    private static long P = 0;
    private static WeakReference<ToygerFaceService> U = null;
    private HashMap<Integer, Double> d = new HashMap<>(3);
    private ToygerFaceAttr i = new ToygerFaceAttr();
    private HashMap<String, Object> j = new HashMap<>();
    private HandlerThread n = null;
    private HandlerThread o = null;
    private HandlerThread p = null;
    private Handler q = null;
    private Handler r = null;
    private Handler s = null;
    private final BlockingQueue<TGSensorFrame> t = new LinkedBlockingDeque(1);
    private final FrameProcessor u = new FrameProcessor();
    private final AtomicBoolean v = new AtomicBoolean(false);
    private final AtomicBoolean w = new AtomicBoolean(false);
    private final Semaphore x = new Semaphore(1);
    private float[] z = null;
    private float[] A = null;
    private long B = 0;
    public boolean initResult = false;
    private boolean C = false;
    private String D = null;
    private String E = null;
    private Context F = null;
    private String G = null;
    private String H = null;
    private Map<String, Object> I = new Map<String, Object>() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Map
        public void clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            }
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a5a3b867", new Object[]{this, obj})).booleanValue();
            }
            return false;
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e4ff0db9", new Object[]{this, obj})).booleanValue();
            }
            return false;
        }

        @Override // java.util.Map
        public Set<Map.Entry<String, Object>> entrySet() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("b3acf2c6", new Object[]{this});
            }
            return null;
        }

        @Override // java.util.Map
        public Object get(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, obj});
            }
            return null;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // java.util.Map
        public Set<String> keySet() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this});
            }
            return null;
        }

        @Override // java.util.Map
        public Object put(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("fd14d676", new Object[]{this, str, obj});
            }
            return null;
        }

        @Override // java.util.Map
        public void putAll(Map<? extends String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6703aacc", new Object[]{this, map});
            }
        }

        @Override // java.util.Map
        public Object remove(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, obj});
            }
            return null;
        }

        @Override // java.util.Map
        public int size() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            return 0;
        }

        @Override // java.util.Map
        public Collection<Object> values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Collection) ipChange.ipc$dispatch("26a6afbe", new Object[]{this});
            }
            return null;
        }
    };
    private String K = null;
    private String L = null;
    private String M = null;
    private boolean Q = false;
    private ToygerFaceAlgorithmConfig R = null;
    private volatile long S = 0;
    private AtomicBoolean T = new AtomicBoolean(false);

    public static /* synthetic */ Object ipc$super(ToygerFaceService toygerFaceService, String str, Object... objArr) {
        if (str.hashCode() == -904647327) {
            super.handleEventTriggered(((Number) objArr[0]).intValue(), (String) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void handleLocalMatchingEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7579c062", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleScanCompleted(int i, List<ToygerFaceInfo> list, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ca079e", new Object[]{this, new Integer(i), list, map});
        }
    }

    public static /* synthetic */ ByteBuffer A(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("758b8033", new Object[]{toygerFaceService}) : toygerFaceService.k;
    }

    public static /* synthetic */ ByteBuffer B(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("3c976734", new Object[]{toygerFaceService}) : toygerFaceService.l;
    }

    public static /* synthetic */ ByteBuffer C(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("3a34e35", new Object[]{toygerFaceService}) : toygerFaceService.m;
    }

    public static /* synthetic */ HandlerThread D(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HandlerThread) ipChange.ipc$dispatch("7a0a0ec7", new Object[]{toygerFaceService}) : toygerFaceService.n;
    }

    public static /* synthetic */ Handler E(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("47b8c910", new Object[]{toygerFaceService}) : toygerFaceService.r;
    }

    public static /* synthetic */ HandlerThread F(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HandlerThread) ipChange.ipc$dispatch("ac0cb205", new Object[]{toygerFaceService}) : toygerFaceService.p;
    }

    public static /* synthetic */ Handler G(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("4c4e32ce", new Object[]{toygerFaceService}) : toygerFaceService.q;
    }

    public static /* synthetic */ ToygerCallback H(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("4996c7c", new Object[]{toygerFaceService}) : toygerFaceService.f6264a;
    }

    public static /* synthetic */ ToygerCallback I(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("3bffbdb", new Object[]{toygerFaceService}) : toygerFaceService.f6264a;
    }

    public static /* synthetic */ ToygerCallback J(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("2e68b3a", new Object[]{toygerFaceService}) : toygerFaceService.f6264a;
    }

    public static /* synthetic */ ToygerCallback K(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("20d1a99", new Object[]{toygerFaceService}) : toygerFaceService.f6264a;
    }

    public static /* synthetic */ ToygerCallback L(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("133a9f8", new Object[]{toygerFaceService}) : toygerFaceService.f6264a;
    }

    public static /* synthetic */ ToygerCallback M(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("5a3957", new Object[]{toygerFaceService}) : toygerFaceService.f6264a;
    }

    public static /* synthetic */ ToygerCallback N(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("ff80c8b6", new Object[]{toygerFaceService}) : toygerFaceService.f6264a;
    }

    public static /* synthetic */ ToygerCallback O(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("fea75815", new Object[]{toygerFaceService}) : toygerFaceService.f6264a;
    }

    public static /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : O;
    }

    public static /* synthetic */ long a(ToygerFaceService toygerFaceService, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e50448e6", new Object[]{toygerFaceService, new Long(j)})).longValue();
        }
        toygerFaceService.B = j;
        return j;
    }

    public static /* synthetic */ Handler a(ToygerFaceService toygerFaceService, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("7edfd144", new Object[]{toygerFaceService, handler});
        }
        toygerFaceService.r = handler;
        return handler;
    }

    public static /* synthetic */ HandlerThread a(ToygerFaceService toygerFaceService, HandlerThread handlerThread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("7dd6fc44", new Object[]{toygerFaceService, handlerThread});
        }
        toygerFaceService.n = handlerThread;
        return handlerThread;
    }

    public static /* synthetic */ ToygerCallback a(ToygerFaceService toygerFaceService, ToygerCallback toygerCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ToygerCallback) ipChange.ipc$dispatch("a36ea8a4", new Object[]{toygerFaceService, toygerCallback});
        }
        toygerFaceService.f6264a = toygerCallback;
        return toygerCallback;
    }

    public static /* synthetic */ ToygerConfig a(ToygerFaceService toygerFaceService, ToygerConfig toygerConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ToygerConfig) ipChange.ipc$dispatch("4f16ab04", new Object[]{toygerFaceService, toygerConfig});
        }
        toygerFaceService.J = toygerConfig;
        return toygerConfig;
    }

    public static /* synthetic */ ToygerRunnable a(ToygerFaceService toygerFaceService, ToygerRunnable toygerRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ToygerRunnable) ipChange.ipc$dispatch("49660a40", new Object[]{toygerFaceService, toygerRunnable});
        }
        toygerFaceService.y = toygerRunnable;
        return toygerRunnable;
    }

    public static /* synthetic */ String a(ToygerFaceService toygerFaceService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adea1ec4", new Object[]{toygerFaceService, str});
        }
        toygerFaceService.D = str;
        return str;
    }

    public static /* synthetic */ ByteBuffer a(ToygerFaceService toygerFaceService, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("f1d18c40", new Object[]{toygerFaceService, byteBuffer});
        }
        toygerFaceService.k = byteBuffer;
        return byteBuffer;
    }

    public static /* synthetic */ void a(ToygerFaceService toygerFaceService, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8bee4bb", new Object[]{toygerFaceService, new Integer(i), str});
        } else {
            super.handleEventTriggered(i, str);
        }
    }

    public static /* synthetic */ boolean a(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83423016", new Object[]{toygerFaceService})).booleanValue() : toygerFaceService.C;
    }

    public static /* synthetic */ boolean a(ToygerFaceService toygerFaceService, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae8a33fa", new Object[]{toygerFaceService, context})).booleanValue() : toygerFaceService.b(context);
    }

    public static /* synthetic */ boolean a(ToygerFaceService toygerFaceService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5048506", new Object[]{toygerFaceService, new Boolean(z)})).booleanValue();
        }
        toygerFaceService.C = z;
        return z;
    }

    public static /* synthetic */ byte[] a(ToygerFaceService toygerFaceService, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("cf2e4177", new Object[]{toygerFaceService, str, str2}) : toygerFaceService.a(str, str2);
    }

    public static /* synthetic */ byte[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("27137f8e", new Object[]{bArr});
        }
        f = bArr;
        return bArr;
    }

    public static /* synthetic */ float[] a(ToygerFaceService toygerFaceService, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("b611f524", new Object[]{toygerFaceService, fArr});
        }
        toygerFaceService.z = fArr;
        return fArr;
    }

    public static /* synthetic */ long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue() : P;
    }

    public static /* synthetic */ long b(ToygerFaceService toygerFaceService, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff1fc785", new Object[]{toygerFaceService, new Long(j)})).longValue();
        }
        toygerFaceService.S = j;
        return j;
    }

    public static /* synthetic */ Context b(ToygerFaceService toygerFaceService, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("7eb5b58d", new Object[]{toygerFaceService, context});
        }
        toygerFaceService.F = context;
        return context;
    }

    public static /* synthetic */ Handler b(ToygerFaceService toygerFaceService, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("7e0660a3", new Object[]{toygerFaceService, handler});
        }
        toygerFaceService.q = handler;
        return handler;
    }

    public static /* synthetic */ HandlerThread b(ToygerFaceService toygerFaceService, HandlerThread handlerThread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("a73e7523", new Object[]{toygerFaceService, handlerThread});
        }
        toygerFaceService.p = handlerThread;
        return handlerThread;
    }

    public static /* synthetic */ ToygerFaceAlgorithmConfig b(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerFaceAlgorithmConfig) ipChange.ipc$dispatch("f32f0ff1", new Object[]{toygerFaceService}) : toygerFaceService.R;
    }

    public static /* synthetic */ String b(ToygerFaceService toygerFaceService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("104535a3", new Object[]{toygerFaceService, str});
        }
        toygerFaceService.E = str;
        return str;
    }

    public static /* synthetic */ ByteBuffer b(ToygerFaceService toygerFaceService, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("c191bfdf", new Object[]{toygerFaceService, byteBuffer});
        }
        toygerFaceService.l = byteBuffer;
        return byteBuffer;
    }

    public static /* synthetic */ float[] b(ToygerFaceService toygerFaceService, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("b7484803", new Object[]{toygerFaceService, fArr});
        }
        toygerFaceService.A = fArr;
        return fArr;
    }

    public static /* synthetic */ long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[0])).longValue() : N;
    }

    public static /* synthetic */ Context c(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("98c0f60c", new Object[]{toygerFaceService}) : toygerFaceService.F;
    }

    public static /* synthetic */ String c(ToygerFaceService toygerFaceService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72a04c82", new Object[]{toygerFaceService, str});
        }
        toygerFaceService.G = str;
        return str;
    }

    public static /* synthetic */ ByteBuffer c(ToygerFaceService toygerFaceService, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("9151f37e", new Object[]{toygerFaceService, byteBuffer});
        }
        toygerFaceService.m = byteBuffer;
        return byteBuffer;
    }

    public static /* synthetic */ String d(ToygerFaceService toygerFaceService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4fb6361", new Object[]{toygerFaceService, str});
        }
        toygerFaceService.M = str;
        return str;
    }

    public static /* synthetic */ AtomicBoolean d(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("3b2a2f95", new Object[]{toygerFaceService}) : toygerFaceService.T;
    }

    public static /* synthetic */ String e(ToygerFaceService toygerFaceService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37567a40", new Object[]{toygerFaceService, str});
        }
        toygerFaceService.L = str;
        return str;
    }

    public static /* synthetic */ void e(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82cf616", new Object[]{toygerFaceService});
        } else {
            Q(toygerFaceService);
        }
    }

    public static /* synthetic */ String f(ToygerFaceService toygerFaceService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99b1911f", new Object[]{toygerFaceService, str});
        }
        toygerFaceService.K = str;
        return str;
    }

    public static /* synthetic */ void f(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4567a797", new Object[]{toygerFaceService});
        } else {
            toygerFaceService.e();
        }
    }

    public static /* synthetic */ ToygerConfig g(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerConfig) ipChange.ipc$dispatch("28606d80", new Object[]{toygerFaceService}) : toygerFaceService.J;
    }

    public static /* synthetic */ FaceBlobManager h(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FaceBlobManager) ipChange.ipc$dispatch("d7eb60f6", new Object[]{toygerFaceService}) : toygerFaceService.e;
    }

    public static /* synthetic */ ToygerCallback i(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("e891e7bb", new Object[]{toygerFaceService}) : toygerFaceService.f6264a;
    }

    public static /* synthetic */ ToygerCallback j(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("e7b8771a", new Object[]{toygerFaceService}) : toygerFaceService.f6264a;
    }

    public static /* synthetic */ ToygerCallback k(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("e6df0679", new Object[]{toygerFaceService}) : toygerFaceService.f6264a;
    }

    public static /* synthetic */ ToygerCallback l(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("e60595d8", new Object[]{toygerFaceService}) : toygerFaceService.f6264a;
    }

    public static /* synthetic */ ToygerCallback m(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("e52c2537", new Object[]{toygerFaceService}) : toygerFaceService.f6264a;
    }

    public static /* synthetic */ ToygerCallback n(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("e452b496", new Object[]{toygerFaceService}) : toygerFaceService.f6264a;
    }

    public static /* synthetic */ boolean o(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c77e524", new Object[]{toygerFaceService})).booleanValue() : toygerFaceService.Q;
    }

    public static /* synthetic */ FrameProcessor p(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameProcessor) ipChange.ipc$dispatch("a2772070", new Object[]{toygerFaceService}) : toygerFaceService.u;
    }

    public static /* synthetic */ ToygerCallback q(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("e1c662b3", new Object[]{toygerFaceService}) : toygerFaceService.f6264a;
    }

    public static /* synthetic */ ToygerCallback r(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCallback) ipChange.ipc$dispatch("e0ecf212", new Object[]{toygerFaceService}) : toygerFaceService.f6264a;
    }

    public static /* synthetic */ AtomicBoolean s(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("9747f364", new Object[]{toygerFaceService}) : toygerFaceService.v;
    }

    public static /* synthetic */ BlockingQueue t(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlockingQueue) ipChange.ipc$dispatch("5211f89c", new Object[]{toygerFaceService}) : toygerFaceService.t;
    }

    public static /* synthetic */ float[] u(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("ef29b77b", new Object[]{toygerFaceService}) : toygerFaceService.z;
    }

    public static /* synthetic */ float[] v(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("945361a", new Object[]{toygerFaceService}) : toygerFaceService.A;
    }

    public static /* synthetic */ long w(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a64d711c", new Object[]{toygerFaceService})).longValue() : toygerFaceService.B;
    }

    public static /* synthetic */ long x(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3388229d", new Object[]{toygerFaceService})).longValue() : toygerFaceService.S;
    }

    public static /* synthetic */ AtomicBoolean y(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("88ed74ea", new Object[]{toygerFaceService}) : toygerFaceService.w;
    }

    public static /* synthetic */ boolean z(ToygerFaceService toygerFaceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4dfd85af", new Object[]{toygerFaceService})).booleanValue() : P(toygerFaceService);
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public /* bridge */ /* synthetic */ boolean init(Context context, ToygerFaceCallback toygerFaceCallback, String str, String str2, Map map) {
        return init2(context, toygerFaceCallback, str, str2, (Map<String, Object>) map);
    }

    private static synchronized boolean P(ToygerFaceService toygerFaceService) {
        synchronized (ToygerFaceService.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("225c6685", new Object[]{toygerFaceService})).booleanValue();
            } else if (toygerFaceService == null) {
                return false;
            } else {
                return toygerFaceService == (U == null ? null : U.get());
            }
        }
    }

    private static synchronized void Q(ToygerFaceService toygerFaceService) {
        synchronized (ToygerFaceService.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af971802", new Object[]{toygerFaceService});
            } else if (toygerFaceService == null) {
                U = null;
            } else {
                U = new WeakReference<>(toygerFaceService);
            }
        }
    }

    public long getCurrentProcessFrame() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d42ad51c", new Object[]{this})).longValue() : O;
    }

    private static byte[] a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d5108ff3", new Object[]{context, str});
        }
        byte[] c2 = c(context, str);
        return c2 == null ? b(context, str) : c2;
    }

    public static boolean isModelFileReady(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37e681fd", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        File file = new File(context.getFilesDir(), ALBiometricsActivityParentView.p);
        File file2 = new File(file, ToygerBaseService.ASSET_FACE);
        if (file2.isFile() && file2.length() != 0) {
            File file3 = new File(file, ToygerBaseService.ASSET_FACE_DRAGONFLY);
            if (file3.isFile() && file3.length() != 0) {
                return true;
            }
        }
        return false;
    }

    private static byte[] b(Context context, String str) {
        InputStream open;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d49a29f4", new Object[]{context, str});
        }
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    open = context.getAssets().open(str);
                    byte[] bArr = new byte[8192];
                    if (open != null) {
                        while (true) {
                            int read = open.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    } else {
                        ToygerLog.e("error asset lenght = 0");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e2) {
                ToygerLog.e("TOYGER_FLOW_ANDROID", "load func: InputStream read model exeception" + e2.getStackTrace());
                if (0 != 0) {
                    inputStream.close();
                }
            }
            if (open != null) {
                open.close();
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            return byteArray;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    private static byte[] c(Context context, String str) {
        int read;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d423c3f5", new Object[]{context, str});
        }
        FileInputStream fileInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File(new File(context.getFilesDir(), ALBiometricsActivityParentView.p), str));
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            read = fileInputStream2.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        fileInputStream2.close();
                        fileInputStream = read;
                    } catch (IOException e) {
                        e = e;
                        fileInputStream = fileInputStream2;
                        ToygerLog.e("TOYGER_FLOW_ANDROID", "load func: InputStream read model exeception" + e.getStackTrace());
                        if (fileInputStream != null) {
                            fileInputStream.close();
                            fileInputStream = fileInputStream;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            return byteArray2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String getByteArrayMD5(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bcd21b4f", new Object[]{bArr});
        }
        StringBuilder sb = new StringBuilder();
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
        } catch (NoSuchAlgorithmException unused) {
        }
        if (messageDigest != null) {
            byte[] digest = messageDigest.digest();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                sb.append(String.format("%02X", Byte.valueOf(digest[i])));
            }
        }
        return sb.toString().toLowerCase();
    }

    private static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        f = a(context, ToygerBaseService.ASSET_FACE);
        if (f != null) {
            return true;
        }
        ToygerLog.e("TOYGER_FLOW_ANDROID", "fail to read model file");
        return false;
    }

    public static boolean preLoad(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb05379c", new Object[]{context})).booleanValue();
        }
        if (f != null) {
            ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.preLoad(): model is already loaded");
            return true;
        }
        boolean a2 = a(context);
        ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.preLoad() : bRet=" + a2);
        return a2;
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.T.set(true);
        }
    }

    public boolean isStale() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc30159a", new Object[]{this})).booleanValue() : this.S != 0 && !P(this);
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        if (isStale()) {
            this.S = 0L;
        }
        this.T.set(false);
    }

    /* renamed from: init  reason: avoid collision after fix types in other method */
    public boolean init2(Context context, ToygerFaceCallback toygerFaceCallback, String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68b2b67a", new Object[]{this, context, toygerFaceCallback, str, str2, map})).booleanValue();
        }
        boolean init = init(context, false, toygerFaceCallback);
        if (!init) {
            return init;
        }
        if (map == null) {
            map = new HashMap<>(2);
        }
        map.put(ToygerBaseService.KEY_ALGORITHM_CONFIG, str);
        map.put(ToygerBaseService.KEY_UPLOAD_CONFIG, str2);
        return config(map);
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public boolean init(Context context, boolean z, ToygerFaceCallback toygerFaceCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3dff30d", new Object[]{this, context, new Boolean(z), toygerFaceCallback})).booleanValue();
        }
        ToygerLog.d("TOYGER_FLOW_ANDROID", "ToygerFaceService.init()");
        h = true;
        int d = d();
        if (d < 0) {
            ToygerLog.e("TOYGER_FLOW_ANDROID", "ToygerFaceService.init() setup working thread error" + d);
            return false;
        }
        this.f6264a = toygerFaceCallback;
        this.F = context;
        if (z) {
            ToygerLog.e("TOYGER_FLOW_ANDROID", "localMatching is not supported");
            return false;
        }
        if (f == null && !a(context)) {
            ToygerLog.e("TOYGER_FLOW_ANDROID", "ToygerFaceService.init() fail to load assets file!");
        }
        if (this.r == null) {
            ((ToygerFaceCallback) this.f6264a).onEvent(-4, null);
            this.initResult = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] a(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.zoloz.toyger.face.ToygerFaceService.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            r2 = 1
            r1[r2] = r8
            r8 = 2
            r1[r8] = r9
            java.lang.String r8 = "4dba22e1"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            byte[] r8 = (byte[]) r8
            return r8
        L1b:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 8192(0x2000, float:1.14794E-41)
            r3 = 0
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r5.<init>()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r5.append(r8)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r5.append(r9)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
        L39:
            int r5 = r4.read(r1)     // Catch: java.io.IOException -> L68 java.lang.Throwable -> L8a
            r6 = -1
            if (r5 == r6) goto L44
            r0.write(r1, r2, r5)     // Catch: java.io.IOException -> L68 java.lang.Throwable -> L8a
            goto L39
        L44:
            r4.close()     // Catch: java.io.IOException -> L48
            goto L4c
        L48:
            r8 = move-exception
            r8.printStackTrace()
        L4c:
            byte[] r8 = r0.toByteArray()
            r0.close()     // Catch: java.io.IOException -> L54
            goto L58
        L54:
            r0 = move-exception
            r0.printStackTrace()
        L58:
            java.lang.String r0 = getByteArrayMD5(r8)
            boolean r9 = r0.equalsIgnoreCase(r9)
            if (r9 == 0) goto L63
            return r8
        L63:
            return r3
        L64:
            r8 = move-exception
            r4 = r3
            goto L8b
        L67:
            r4 = r3
        L68:
            java.lang.String r9 = "TOYGER_FLOW_ANDROID"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r0.<init>()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "readFileInPrivateArea："
            r0.append(r1)     // Catch: java.lang.Throwable -> L8a
            r0.append(r8)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> L8a
            com.alipay.zoloz.toyger.ToygerLog.e(r9, r8)     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto L89
            r4.close()     // Catch: java.io.IOException -> L85
            goto L89
        L85:
            r8 = move-exception
            r8.printStackTrace()
        L89:
            return r3
        L8a:
            r8 = move-exception
        L8b:
            if (r4 == 0) goto L95
            r4.close()     // Catch: java.io.IOException -> L91
            goto L95
        L91:
            r9 = move-exception
            r9.printStackTrace()
        L95:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.toyger.face.ToygerFaceService.a(java.lang.String, java.lang.String):byte[]");
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public boolean config(final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0bcb9a0", new Object[]{this, map})).booleanValue();
        }
        ToygerLog.d("TOYGER_FLOW_ANDROID", "ToygerFaceService.config()");
        if (map != null) {
            this.I = map;
            String str = (String) map.get(ToygerBaseService.KEY_ALGORITHM_CONFIG);
            String str2 = (String) map.get(ToygerBaseService.KEY_PUBLIC_KEY);
            String str3 = (String) map.get(ToygerBaseService.KEY_UPLOAD_CONFIG);
            String str4 = (String) map.get(ToygerBaseService.KEY_IS_MIRROR);
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                ToygerLog.e("TOYGER_FLOW_ANDROID", "ToygerFaceService.config() Invalid key or upload config!");
                return false;
            }
            ToygerFaceBlobConfig from = ToygerFaceBlobConfig.from(str3, str2);
            this.e = a(map, from);
            this.R = ToygerFaceAlgorithmConfig.from(str);
            this.e.isNano = from.collection.contains(BlobManager.SUB_TYPE_NANO) || from.collection.contains(BlobManager.SUB_TYPE_GRAY_NANO);
            if (this.R.liveness_combination.contains(ToygerFaceAlgorithmConfig.DRAGONFLY_LIVENESS)) {
                ToygerLog.d("TOYGER_FLOW_ANDROID", "collection contains DragonflyLiveness");
            } else {
                ToygerLog.d("TOYGER_FLOW_ANDROID", "collection dont contains DragonflyLiveness");
            }
            if (this.e.isNano && !this.R.liveness_combination.contains(ToygerFaceAlgorithmConfig.DRAGONFLY_LIVENESS)) {
                this.R.liveness_combination.add(ToygerFaceAlgorithmConfig.DRAGONFLY_LIVENESS);
                if (!this.R.threshold.containsKey(ToygerFaceAlgorithmConfig.DRAGONFLY_LIVENESS)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.5f));
                    this.R.threshold.put(ToygerFaceAlgorithmConfig.DRAGONFLY_LIVENESS, arrayList);
                }
                ToygerLog.d("TOYGER_FLOW_ANDROID", "collection is nano, adding DragonflyLiveness, result=" + this.R.liveness_combination);
            }
            if (str2 != null && from != null) {
                if (str4 != null && Boolean.parseBoolean(str4)) {
                    z = true;
                }
                this.Q = z;
                final ToygerConfig a2 = a(this.R, from, map);
                a(from);
                if (a2.livenessConfig.collection.contains(BlobManager.SUB_TYPE_NANO)) {
                    f = a(this.F, ToygerBaseService.ASSET_FACE);
                } else if (f == null) {
                    ToygerLog.i("TOYGER_FLOW_ANDROID", "model == null need reload");
                    byte[] a3 = a(this.F, ToygerBaseService.ASSET_FACE);
                    f = a3;
                    if (a3 == null) {
                        ToygerLog.e("TOYGER_FLOW_ANDROID", "reload model error");
                    }
                }
                Handler handler = this.r;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
                        /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
                        /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
                        /* JADX WARN: Removed duplicated region for block: B:74:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public void run() {
                            /*
                                Method dump skipped, instructions count: 484
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.toyger.face.ToygerFaceService.AnonymousClass2.run():void");
                        }
                    });
                }
            }
        }
        return true;
    }

    private boolean b(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.initToygerNative");
        HashMap hashMap = new HashMap(4);
        this.K = ToygerFaceState.class.getName().replace(".", "/");
        this.L = ToygerFaceAttr.class.getName().replace(".", "/");
        this.M = TGFrame.class.getName().replace(".", "/");
        String str = this.K;
        if (str != null && this.L != null && this.M != null && f != null) {
            hashMap.put("StateSignature", str);
            hashMap.put("AttrSignature", this.L);
            hashMap.put("FrameSignature", this.M);
            hashMap.put("Algorithm", "Face");
            hashMap.put("Capacity", "1");
            ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.initToygerNative check ok, prepare to init native");
            try {
                z = Toyger.init(context, f, g, context.getPackageName(), hashMap);
            } catch (UnsatisfiedLinkError unused) {
            }
            if (z) {
                this.S = Toyger.getCurrentToygerPtr();
                ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.initToygerNative succeed with NativePtr " + this.S + " for ToygerFaceService " + hashCode());
            } else {
                this.S = 0L;
            }
        } else {
            String str2 = "";
            if (this.K == null) {
                str2 = str2 + "faceStateSignature == null;";
            }
            if (this.L == null) {
                str2 = str2 + "faceAttrSignature == null;";
            }
            if (this.M == null) {
                str2 = str2 + "tgFrameSignature == null;";
            }
            if (f == null) {
                str2 = str2 + "model == null;";
            }
            ToygerLog.e("TOYGER_FLOW_ANDROID", "ToygerFaceSerivce.initToygerNative: " + str2);
        }
        return z;
    }

    private FaceBlobManager a(Map<String, Object> map, ToygerFaceBlobConfig toygerFaceBlobConfig) {
        FaceBlobManager faceBlobManager;
        String str = (String) map.get("meta_serializer");
        String str2 = (str != null ? Integer.parseInt(str) : 1) != 2 ? "com.alipay.zoloz.toyger.face.FaceBlobManagerJson" : "com.alipay.zoloz.toyger.face.FaceBlobManagerPb";
        boolean booleanValue = map.containsKey(ToygerBaseService.KEY_ENABLE_ENCUP) ? ((Boolean) map.get(ToygerBaseService.KEY_ENABLE_ENCUP)).booleanValue() : true;
        try {
            Constructor<?> declaredConstructor = Class.forName(str2).getDeclaredConstructor(ToygerFaceBlobConfig.class, Boolean.TYPE);
            declaredConstructor.setAccessible(true);
            faceBlobManager = (FaceBlobManager) declaredConstructor.newInstance(toygerFaceBlobConfig, Boolean.valueOf(booleanValue));
        } catch (Throwable unused) {
            ToygerLog.w("TOYGER_FLOW_ANDROID", "blobManagerClassName error");
            faceBlobManager = null;
        }
        faceBlobManager.compressFormat = toygerFaceBlobConfig.uploadImageType;
        faceBlobManager.compressRate = toygerFaceBlobConfig.upload_compress_rate;
        return faceBlobManager;
    }

    private int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        if (this.n == null) {
            HandlerThreadPool.setKeepAliveTime(3000L);
            this.n = HandlerThreadPool.borrowHandlerThread("ToygerProcessQueue");
            if (this.n == null) {
                return -1;
            }
        }
        if (this.r == null) {
            this.r = new Handler(this.n.getLooper());
            if (this.r == null) {
                return -2;
            }
        }
        if (this.p == null) {
            this.p = new HandlerThread("ToygerCallbackQueue");
            this.p.start();
            if (this.p == null) {
                return -3;
            }
        }
        if (this.q == null) {
            this.q = new Handler(this.p.getLooper()) { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                    if (str.hashCode() == 673877017) {
                        super.handleMessage((Message) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                        return;
                    }
                    int i = message.what;
                    if (i != 0) {
                        if (i != 1) {
                            super.handleMessage(message);
                            return;
                        }
                        HashMap hashMap = (HashMap) message.obj;
                        ToygerFaceState toygerFaceState = (ToygerFaceState) hashMap.get("TOYGER_CALLBACK_STATE_KEY");
                        ToygerFaceAttr toygerFaceAttr = new ToygerFaceAttr((ToygerFaceAttr) hashMap.get("TOYGER_CALLBACK_ATTR_KEY"), ToygerFaceService.o(ToygerFaceService.this));
                        HashMap hashMap2 = new HashMap(2);
                        hashMap2.put(ToygerFaceService.KEY_TOYGER_FRAME, ToygerFaceService.p(ToygerFaceService.this).getTgFrame());
                        hashMap2.put(ToygerFaceService.KEY_TOYGER_DEPTH_FRAME, ToygerFaceService.p(ToygerFaceService.this).getTgDepthFrame());
                        if (ToygerFaceService.q(ToygerFaceService.this) == null) {
                            return;
                        }
                        ((ToygerFaceCallback) ToygerFaceService.r(ToygerFaceService.this)).onStateUpdated(toygerFaceState, toygerFaceAttr, hashMap2);
                        return;
                    }
                    HashMap hashMap3 = (HashMap) message.obj;
                    int i2 = message.arg2;
                    if (i2 == 2) {
                        ToygerLog.v("TOYGER_FLOW_NATIVE", hashMap3.toString());
                    } else if (i2 == 3) {
                        ToygerLog.d("TOYGER_FLOW_NATIVE", hashMap3.toString());
                    } else if (i2 == 4) {
                        ToygerLog.i("TOYGER_FLOW_NATIVE", hashMap3.toString());
                    } else if (i2 != 6) {
                        ToygerLog.i("TOYGER_FLOW_NATIVE", hashMap3.toString());
                    } else {
                        ToygerLog.e("TOYGER_FLOW_NATIVE", hashMap3.toString());
                    }
                }
            };
            if (this.q == null) {
                return -4;
            }
        }
        return 0;
    }

    private void a(ToygerFaceBlobConfig toygerFaceBlobConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4381bcaa", new Object[]{this, toygerFaceBlobConfig});
        } else if (!toygerFaceBlobConfig.collection.contains(BlobManager.SUB_TYPE_GYRO)) {
        } else {
            if (this.o == null) {
                this.o = new HandlerThread("ToygerSensorProcessQueue");
                this.o.start();
            }
            if (this.s == null) {
                this.s = new Handler(this.o.getLooper());
            }
            super.handleEventTriggered(-8, "");
        }
    }

    private ToygerConfig a(ToygerFaceAlgorithmConfig toygerFaceAlgorithmConfig, ToygerFaceBlobConfig toygerFaceBlobConfig, Map<String, Object> map) {
        ToygerCameraConfig toygerCameraConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ToygerConfig) ipChange.ipc$dispatch("f7d34b0f", new Object[]{this, toygerFaceAlgorithmConfig, toygerFaceBlobConfig, map});
        }
        ToygerConfig toygerConfig = toygerFaceAlgorithmConfig.toToygerConfig();
        toygerConfig.livenessConfig.collection = b(toygerFaceBlobConfig);
        toygerConfig.livenessConfig.livenessCombinations = a(toygerFaceAlgorithmConfig);
        toygerConfig.commonConfig.useXNN = toygerFaceAlgorithmConfig.usexnnModel;
        toygerConfig.livenessConfig.dragonflyRetryLimit = toygerFaceAlgorithmConfig.dragonflyRetryLimit;
        Map<String, List<Float>> map2 = toygerFaceAlgorithmConfig.threshold;
        if (map2 != null) {
            List<Float> list = map2.get(ToygerFaceAlgorithmConfig.DRAGONFLY_LIVENESS);
            ToygerLog.d("TOYGER_FLOW_ANDROID", "DragonflyLiveness-GotDragonFly");
            List<Float> list2 = list;
            if (list2 != null) {
                ToygerLog.d("TOYGER_FLOW_ANDROID", "DragonflyLiveness-ParamSize:" + list2.size());
                if (list2.size() == 1) {
                    toygerConfig.livenessConfig.dragonflyMax = list2.get(0).floatValue();
                    ToygerLog.d("TOYGER_FLOW_ANDROID", "DragonflyLiveness-Param:" + toygerConfig.livenessConfig.dragonflyMax);
                } else if (list2.size() == 2) {
                    toygerConfig.livenessConfig.dragonflyMin = list2.get(0).floatValue();
                    toygerConfig.livenessConfig.dragonflyMax = list2.get(1).floatValue();
                    ToygerLog.d("TOYGER_FLOW_ANDROID", "DragonflyLiveness-Param:range[" + toygerConfig.livenessConfig.dragonflyMin + "," + toygerConfig.livenessConfig.dragonflyMax + riy.ARRAY_END_STR);
                }
            }
            List<Float> list3 = map2.get(ToygerFaceAlgorithmConfig.GEMINI_LIVENESS);
            if (list3 != null) {
                for (int i = 0; i < list3.size(); i++) {
                    float floatValue = list3.get(i).floatValue();
                    if (i == 0) {
                        toygerConfig.livenessConfig.geminiMin = floatValue;
                    } else if (i == 1) {
                        toygerConfig.livenessConfig.geminiMax = floatValue;
                    }
                }
            }
            List<Float> list4 = map2.get(ToygerFaceAlgorithmConfig.BAT_LIVENESS);
            if (list4 != null && list4.size() > 0) {
                toygerConfig.livenessConfig.batLivenessThreshold = list4.get(0).floatValue();
            }
            List<Float> list5 = map2.get(ToygerFaceAlgorithmConfig.ZFACE_BLINK_LIVENESS);
            if (list5 != null) {
                ToygerLog.d("TOYGER_FLOW_ANDROID", "blinkThreshold.size" + list5.size());
            } else {
                ToygerLog.d("TOYGER_FLOW_ANDROID", "blinkThreshold is empty");
            }
            if (list5 != null && list5.size() == 2) {
                toygerConfig.livenessConfig.eye_blink_threshold = list5.get(0).floatValue();
                toygerConfig.livenessConfig.eye_occlusion_threshold = list5.get(1).floatValue();
                ToygerLog.d("TOYGER_FLOW_ANDROID", "eye_blink_threshold:" + toygerConfig.livenessConfig.eye_blink_threshold + "---eye_occlusion_threshold:" + toygerConfig.livenessConfig.eye_occlusion_threshold);
            }
            if (map != null && (toygerCameraConfig = (ToygerCameraConfig) map.get(ToygerBaseService.KEY_CAMERA_CONFIG)) != null) {
                toygerConfig.cameraConfig = toygerCameraConfig;
                toygerConfig.cameraConfig.isMirror = this.Q;
                ToygerLog.i("TOYGER_FLOW_ANDROID", "cameraConfig=" + toygerCameraConfig.toString());
            }
        }
        return toygerConfig;
    }

    private String b(ToygerFaceBlobConfig toygerFaceBlobConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9d3c837", new Object[]{this, toygerFaceBlobConfig});
        }
        String str = "";
        if (toygerFaceBlobConfig.collection != null) {
            String str2 = str;
            for (int i = 0; i < toygerFaceBlobConfig.collection.size(); i++) {
                if (str2.length() > 0) {
                    str2 = str2.concat("#").concat(toygerFaceBlobConfig.collection.get(i));
                } else {
                    str2 = toygerFaceBlobConfig.collection.get(i);
                }
            }
            str = str2;
        }
        if (toygerFaceBlobConfig.dataCollection != null) {
            for (int i2 = 0; i2 < toygerFaceBlobConfig.dataCollection.size(); i2++) {
                if (str.length() > 0) {
                    str = str.concat("#").concat(toygerFaceBlobConfig.dataCollection.get(i2));
                } else {
                    str = toygerFaceBlobConfig.dataCollection.get(i2);
                }
            }
        }
        return str;
    }

    private String a(ToygerFaceAlgorithmConfig toygerFaceAlgorithmConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e8ae1aa", new Object[]{this, toygerFaceAlgorithmConfig});
        }
        String str = "";
        for (int i = 0; i < toygerFaceAlgorithmConfig.liveness_combination.size(); i++) {
            if (str.length() > 0) {
                str = str.concat("#").concat(toygerFaceAlgorithmConfig.liveness_combination.get(i));
            } else {
                str = toygerFaceAlgorithmConfig.liveness_combination.get(i);
            }
        }
        return str;
    }

    public boolean processSensorData(final TGSensorFrame tGSensorFrame) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d677d20", new Object[]{this, tGSensorFrame})).booleanValue();
        }
        if (!this.e.isGyroNeeded) {
            return true;
        }
        if (tGSensorFrame != null && this.t.offer(tGSensorFrame)) {
            if (this.s != null) {
                z = true;
            }
            if (z) {
                this.s.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (ToygerFaceService.d(ToygerFaceService.this).get() || !ToygerFaceService.s(ToygerFaceService.this).get()) {
                                return;
                            }
                            TGSensorFrame tGSensorFrame2 = (TGSensorFrame) ToygerFaceService.t(ToygerFaceService.this).poll(1L, TimeUnit.SECONDS);
                            if (tGSensorFrame.gyroData != null) {
                                ToygerLog.i("zsensor", "processingQueue caching gyroData");
                                ToygerFaceService.a(ToygerFaceService.this, tGSensorFrame2.gyroData);
                                ToygerFaceService.a(ToygerFaceService.this, tGSensorFrame2.timeStamp);
                            }
                            if (tGSensorFrame.rotationData != null) {
                                ToygerFaceService.b(ToygerFaceService.this, tGSensorFrame2.rotationData);
                            }
                            if (tGSensorFrame2 == null || ToygerFaceService.u(ToygerFaceService.this) == null) {
                                return;
                            }
                            Toyger.processSensorData(ToygerFaceService.u(ToygerFaceService.this), null, ToygerFaceService.v(ToygerFaceService.this), ToygerFaceService.w(ToygerFaceService.this));
                            ToygerFaceService.a(ToygerFaceService.this, (float[]) null);
                            ToygerFaceService.a(ToygerFaceService.this, 0L);
                        } catch (Throwable th) {
                            ToygerLog.e("TOYGER_FLOW_ANDROID", "Failed to processSensorData", th);
                        }
                    }
                });
            }
        }
        return true;
    }

    private double a(TGFrame tGFrame, TGDepthFrame tGDepthFrame) {
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4459f77f", new Object[]{this, tGFrame, tGDepthFrame})).doubleValue();
        }
        double d2 = -1.0d;
        Double valueOf = Double.valueOf(-1.0d);
        if (tGFrame != null) {
            valueOf = this.d.get(Integer.valueOf(tGFrame.frameMode));
        }
        if (tGDepthFrame != null) {
            valueOf = this.d.get(7);
        }
        if (valueOf != null) {
            return valueOf.doubleValue();
        }
        if (tGFrame != null) {
            double d3 = tGFrame.width * tGFrame.height;
            if (tGFrame.frameType != 2) {
                switch (tGFrame.frameMode) {
                    case 0:
                        d = 1.5d;
                        break;
                    case 1:
                    case 3:
                        d = 4.0d;
                        break;
                    case 2:
                    case 4:
                        d = 3.0d;
                        break;
                    case 5:
                        d = 1.0d;
                        break;
                    case 6:
                        d = 2.0d;
                        break;
                    default:
                        d = 0.0d;
                        break;
                }
                double d4 = d3 * d;
                valueOf = new Double(d4);
                d2 = d4;
            }
            this.d.put(Integer.valueOf(tGFrame.frameMode), valueOf);
        }
        if (tGDepthFrame == null) {
            return d2;
        }
        double d5 = tGDepthFrame.width * tGDepthFrame.height * 2.0d;
        this.d.put(7, new Double(d5));
        return d5;
    }

    private void a(TGFrame tGFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5510b4", new Object[]{this, tGFrame});
        } else if (tGFrame == null) {
        } else {
            int a2 = (int) a(tGFrame, (TGDepthFrame) null);
            if (this.m == null) {
                this.m = Toyger.allocIRFrameData(a2);
            }
            ByteBuffer byteBuffer = tGFrame.byteBuffer;
            if (byteBuffer == null) {
                return;
            }
            int limit = byteBuffer.limit();
            int min = Math.min(a2, limit);
            this.m.rewind();
            if (limit == a2) {
                this.m.put(byteBuffer);
            } else {
                this.m.put(byteBuffer.array(), 0, min);
            }
            this.m.rewind();
            Toyger.fetchIRFrameData(tGFrame.byteBuffer, min);
        }
    }

    private void b(TGFrame tGFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81fb293", new Object[]{this, tGFrame});
        } else if (tGFrame == null) {
        } else {
            int a2 = (int) a(tGFrame, (TGDepthFrame) null);
            ByteBuffer byteBuffer = tGFrame.byteBuffer;
            if (this.k == null) {
                this.k = Toyger.allocRGBFrameData(a2);
            }
            if (byteBuffer != null) {
                int limit = byteBuffer.limit();
                int min = Math.min(limit, a2);
                byteBuffer.position();
                this.k.rewind();
                if (limit == a2) {
                    this.k.put(byteBuffer);
                } else {
                    this.k.put(byteBuffer.array(), 0, min);
                }
                this.k.rewind();
                Toyger.fetchRGBFrameData(this.k, min);
                return;
            }
            ToygerLog.e("TOYGER_FLOW_ANDROID", "ToygerFaceService.deepCopyRGBFrame buffer = null");
        }
    }

    private void a(TGDepthFrame tGDepthFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef9b45", new Object[]{this, tGDepthFrame});
        } else if (tGDepthFrame == null) {
        } else {
            int a2 = (int) a((TGFrame) null, tGDepthFrame);
            ByteBuffer byteBuffer = tGDepthFrame.byteBuffer;
            if (this.l == null) {
                this.l = Toyger.allocDepthFrameData(a2);
            }
            if (byteBuffer != null) {
                int limit = byteBuffer.limit();
                int min = Math.min(limit, a2);
                this.l.rewind();
                if (limit != a2) {
                    this.l.put(byteBuffer.array(), 0, min);
                } else {
                    this.l.put(byteBuffer);
                }
                this.l.rewind();
                Toyger.fetchDepthFrameData(this.l.asShortBuffer(), min);
                return;
            }
            ToygerLog.e("TOYGER_FLOW_ANDROID", "ToygerFaceService.deepCopyTGDepthFrame buffer = null");
        }
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public boolean processImage(List<TGFrame> list, TGDepthFrame tGDepthFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bbae485", new Object[]{this, list, tGDepthFrame})).booleanValue();
        }
        if (this.T.get() || this.S == 0) {
            return true;
        }
        N++;
        if (this.initResult && this.w.compareAndSet(false, true)) {
            O++;
            System.currentTimeMillis();
            ArrayList arrayList = new ArrayList(list.size());
            for (TGFrame tGFrame : list) {
                if (tGFrame.frameType == 3) {
                    a(tGFrame);
                } else {
                    b(tGFrame);
                }
                arrayList.add(tGFrame);
            }
            if (tGDepthFrame != null && tGDepthFrame.byteBuffer != null && tGDepthFrame != null) {
                a(tGDepthFrame);
            }
            if (this.r != null) {
                if (this.y == null) {
                    this.y = new ToygerRunnable(arrayList, tGDepthFrame, this.i) { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                            if (str.hashCode() == 1548812690) {
                                super.run();
                                return null;
                            }
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        }

                        @Override // com.alipay.zoloz.toyger.face.ToygerRunnable, java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            if (!ToygerFaceService.d(ToygerFaceService.this).get() && ToygerFaceService.x(ToygerFaceService.this) != 0) {
                                super.run();
                            }
                            ToygerFaceService.y(ToygerFaceService.this).set(false);
                            ToygerLog.d("TOYGER_FLOW_ANDROID", "ToygerFaceService.processimage process frame count:" + ToygerFaceService.a() + " drop frame count:" + ToygerFaceService.b() + ",total frame:" + ToygerFaceService.c());
                        }
                    };
                }
                ToygerRunnable toygerRunnable = this.y;
                toygerRunnable.frames = arrayList;
                toygerRunnable.depthFrame = tGDepthFrame;
                toygerRunnable.attr = this.i;
                this.r.post(toygerRunnable);
            }
            return true;
        }
        if (!this.initResult) {
            ToygerLog.e("TOYGER_FLOW_ANDROID", "init fail, do not processed");
        } else {
            ToygerLog.w("TOYGER_FLOW_ANDROID", "Toyger is busy ....");
        }
        P++;
        return false;
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.w.set(false);
        Handler handler = this.r;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ToygerFaceService.a(ToygerFaceService.this)) {
                        throw new IllegalStateException("local mathching is not supported");
                    } else {
                        if (ToygerFaceService.x(ToygerFaceService.this) == 0 || !ToygerFaceService.z(ToygerFaceService.this)) {
                            ToygerLog.i("TOYGER_FLOW_ANDROID", "toyger service cannot reset due to instance change");
                            return;
                        }
                        Toyger.reset();
                        ToygerLog.i("TOYGER_FLOW_ANDROID", "toyger service reset");
                    }
                }
            });
        }
        ToygerLog.i("TOYGER_FLOW_ANDROID", "reset time cost " + (System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public void release(final Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f2ad3e", new Object[]{this, handler});
            return;
        }
        h = false;
        final long currentTimeMillis = System.currentTimeMillis();
        this.v.set(false);
        if (this.o != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                this.o.quitSafely();
            } else {
                this.o.quit();
            }
            ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.release mSensorThread quited time:" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        Handler handler2 = this.r;
        if (handler2 == null) {
            return;
        }
        handler2.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                StringBuilder sb;
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ToygerFaceService.a(ToygerFaceService.this)) {
                    throw new IllegalStateException("local mathching is not supported");
                } else {
                    if (ToygerFaceService.A(ToygerFaceService.this) != null) {
                        Toyger.releaseRGBFrameData(ToygerFaceService.A(ToygerFaceService.this));
                        ToygerFaceService.a(ToygerFaceService.this, (ByteBuffer) null);
                    }
                    if (ToygerFaceService.B(ToygerFaceService.this) != null) {
                        Toyger.releaseDepthFrameData(ToygerFaceService.B(ToygerFaceService.this));
                        ToygerFaceService.b(ToygerFaceService.this, (ByteBuffer) null);
                    }
                    if (ToygerFaceService.C(ToygerFaceService.this) != null) {
                        Toyger.releaseIRFrameData(ToygerFaceService.C(ToygerFaceService.this));
                        ToygerFaceService.c(ToygerFaceService.this, (ByteBuffer) null);
                    }
                    if (ToygerFaceService.x(ToygerFaceService.this) != 0) {
                        if (ToygerFaceService.z(ToygerFaceService.this)) {
                            Toyger.reset();
                            Toyger.release();
                            ToygerFaceService.e(null);
                            ToygerFaceService.b(ToygerFaceService.this, 0L);
                            sb = new StringBuilder();
                            sb.append("Toyger release called in FaceService.release() for nativePtr ");
                            sb.append(ToygerFaceService.x(ToygerFaceService.this));
                            str = ", and ToyerFaceService is ";
                        } else {
                            sb = new StringBuilder();
                            str = "Toyger release cannot call Toyger.release since owner change ToyerFaceService is ";
                        }
                        sb.append(str);
                        sb.append(ToygerFaceService.this.hashCode());
                        ToygerLog.i("TOYGER_FLOW_ANDROID", sb.toString());
                    }
                    handler.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.7.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            long currentTimeMillis3 = System.currentTimeMillis();
                            try {
                                if (ToygerFaceService.D(ToygerFaceService.this) != null) {
                                    HandlerThreadPool.returnHandlerThread(ToygerFaceService.D(ToygerFaceService.this));
                                    ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.release mProcessThread quited time:" + (System.currentTimeMillis() - currentTimeMillis3) + "ms");
                                }
                                ToygerFaceService.a(ToygerFaceService.this, (HandlerThread) null);
                                if (ToygerFaceService.E(ToygerFaceService.this) != null) {
                                    ToygerFaceService.E(ToygerFaceService.this).removeCallbacksAndMessages(null);
                                    ToygerFaceService.a(ToygerFaceService.this, (Handler) null);
                                }
                                if (ToygerFaceService.F(ToygerFaceService.this) != null) {
                                    if (Build.VERSION.SDK_INT >= 18) {
                                        ToygerFaceService.F(ToygerFaceService.this).quitSafely();
                                    } else {
                                        ToygerFaceService.F(ToygerFaceService.this).quit();
                                    }
                                    ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.release mCallbackThread quited time:" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                                }
                                ToygerFaceService.b(ToygerFaceService.this, (HandlerThread) null);
                                if (ToygerFaceService.G(ToygerFaceService.this) != null) {
                                    ToygerFaceService.G(ToygerFaceService.this).removeCallbacksAndMessages(null);
                                    ToygerFaceService.b(ToygerFaceService.this, (Handler) null);
                                }
                            } catch (Exception unused) {
                                ToygerLog.i("TOYGER_FLOW_ANDROID", "toyger release exeception");
                            }
                            ToygerFaceService.y(ToygerFaceService.this).set(false);
                            ToygerFaceService.a(ToygerFaceService.this, false);
                            ToygerFaceService.a(ToygerFaceService.this, (float[]) null);
                            ToygerFaceService.b(ToygerFaceService.this, (float[]) null);
                            ToygerFaceService.b(ToygerFaceService.this, (Context) null);
                            ToygerFaceService.a(ToygerFaceService.this, (String) null);
                            ToygerFaceService.b(ToygerFaceService.this, (String) null);
                            ToygerFaceService.c(ToygerFaceService.this, (String) null);
                            synchronized (ToygerFaceService.class) {
                                ToygerFaceService.a(ToygerFaceService.this, (ToygerCallback) null);
                            }
                            ToygerFaceService.d(ToygerFaceService.this, null);
                            ToygerFaceService.e(ToygerFaceService.this, null);
                            ToygerFaceService.f(ToygerFaceService.this, null);
                            ToygerFaceService.a(ToygerFaceService.this, (ToygerRunnable) null);
                            ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.release time:" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                        }
                    });
                    ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.release mProcessThreadHandler=null, Toyger.release time:" + (System.currentTimeMillis() - currentTimeMillis2) + "ms");
                }
            }
        });
    }

    public static Bitmap bitmapFromTGFrame(TGFrame tGFrame, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("8839ee3e", new Object[]{tGFrame, new Boolean(z)}) : ToygerImageUtil.tgFrameToBitmap(tGFrame, tGFrame.width, 1.0f, z);
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleEventTriggered(final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca142d61", new Object[]{this, new Integer(i), str});
        } else {
            this.q.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ToygerFaceService.a(ToygerFaceService.this, i, str);
                    }
                }
            });
        }
    }

    public void handleDepthInfoReady(final ToygerDepthInfo toygerDepthInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf775332", new Object[]{this, toygerDepthInfo});
        } else {
            this.q.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FaceBlobManager h2 = ToygerFaceService.h(ToygerFaceService.this);
                    ToygerDepthInfo toygerDepthInfo2 = toygerDepthInfo;
                    h2.depthInfo = toygerDepthInfo2;
                    if (toygerDepthInfo2 == null) {
                        return;
                    }
                    ToygerFaceService.h(ToygerFaceService.this).bestDepthImage = ToygerFaceService.h(ToygerFaceService.this).processDepthInfo(toygerDepthInfo);
                }
            });
        }
    }

    public void handleInfraRedInfoReady(final TGFrame tGFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55df8d09", new Object[]{this, tGFrame});
        } else {
            this.q.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FaceBlobManager h2 = ToygerFaceService.h(ToygerFaceService.this);
                    TGFrame tGFrame2 = tGFrame;
                    h2.irFrame = tGFrame2;
                    if (tGFrame2 == null) {
                        return;
                    }
                    ToygerFaceService.h(ToygerFaceService.this).bestIRImage = ToygerFaceService.h(ToygerFaceService.this).processIRFrameInfo(tGFrame, true ^ ToygerFaceService.o(ToygerFaceService.this));
                }
            });
        }
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleStateUpdated(ToygerFaceState toygerFaceState, ToygerFaceAttr toygerFaceAttr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6a5b39", new Object[]{this, toygerFaceState, toygerFaceAttr});
            return;
        }
        this.j.put("TOYGER_CALLBACK_STATE_KEY", toygerFaceState);
        this.j.put("TOYGER_CALLBACK_ATTR_KEY", toygerFaceAttr);
        this.q.dispatchMessage(this.q.obtainMessage(c, this.j));
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleInfoReady(final TGFrame tGFrame, final ToygerFaceAttr toygerFaceAttr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc00498", new Object[]{this, tGFrame, toygerFaceAttr});
        } else {
            this.q.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    ToygerFaceService.h(ToygerFaceService.this).bestLightImage = ToygerImageUtil.tgFrameToBlob(tGFrame, ToygerFaceService.h(ToygerFaceService.this).desireWidth, ToygerFaceService.h(ToygerFaceService.this).compressRate, ToygerFaceService.h(ToygerFaceService.this).compressFormat, ToygerFaceService.o(ToygerFaceService.this));
                    try {
                        if (ToygerFaceService.H(ToygerFaceService.this) != null) {
                            TGFrame tGFrame2 = tGFrame;
                            int i = tGFrame.width;
                            if (!ToygerFaceService.o(ToygerFaceService.this)) {
                                z = true;
                            }
                            ((ToygerFaceCallback) ToygerFaceService.I(ToygerFaceService.this)).onHighQualityFrame(ToygerImageUtil.tgFrameToBitmap(tGFrame2, i, 1.0f, z), new ToygerFaceAttr(toygerFaceAttr, ToygerFaceService.o(ToygerFaceService.this)));
                        }
                    } catch (NullPointerException e) {
                        ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.catchNullException:handleInfoReady:" + e.getMessage());
                    }
                    ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.handleInfoReady time:" + (System.currentTimeMillis() - currentTimeMillis));
                }
            });
        }
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleCaptureCompleted(final int i, final List<ToygerFaceInfo> list, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a01105", new Object[]{this, new Integer(i), list, map});
            return;
        }
        this.e.runtimeInfo = Toyger.getRuntimeInfo();
        List<ToygerDataInfo> collectionData = Toyger.getCollectionData();
        ToygerLog.i("TOYGER_FLOW_ANDROID", "handleCaptureCompleted dataInfo " + collectionData.toString());
        this.e.dataInfos.addAll(collectionData);
        this.q.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                ToygerFaceService.h(ToygerFaceService.this).isMirror = ToygerFaceService.o(ToygerFaceService.this);
                System.currentTimeMillis();
                byte[] generateBlob = ToygerFaceService.h(ToygerFaceService.this).generateBlob(list, map);
                byte[] key = ToygerFaceService.h(ToygerFaceService.this).getKey();
                boolean z = i < 0;
                byte[] bArr = null;
                if (ToygerFaceService.h(ToygerFaceService.this).isNano && !z) {
                    ToygerFaceService.h(ToygerFaceService.this).isNano = false;
                    bArr = ToygerFaceService.h(ToygerFaceService.this).generateBlob(list, map);
                    ToygerFaceService.h(ToygerFaceService.this).isNano = true;
                }
                int length = generateBlob == null ? 0 : generateBlob.length;
                StringBuilder sb = new StringBuilder();
                sb.append("handleCaptureCompleted time cost:");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                sb.append("ms; blob Content size:");
                sb.append(length);
                sb.append(z ? "|活体失败" : "|活体成功");
                ToygerLog.i("TOYGER_FLOW_ANDROID", sb.toString());
                ToygerFaceService.f(ToygerFaceService.this);
                try {
                    if (ToygerFaceService.J(ToygerFaceService.this) == null) {
                        return;
                    }
                    if (z) {
                        ((ToygerFaceCallback) ToygerFaceService.K(ToygerFaceService.this)).onAsyncUpload(-200, generateBlob, key, ToygerFaceService.h(ToygerFaceService.this).isUTF8());
                        return;
                    }
                    if (ToygerFaceService.h(ToygerFaceService.this).isNano && bArr != null) {
                        ((ToygerFaceCallback) ToygerFaceService.L(ToygerFaceService.this)).onAsyncUpload(0, bArr, key, ToygerFaceService.h(ToygerFaceService.this).isUTF8());
                    }
                    ((ToygerFaceCallback) ToygerFaceService.M(ToygerFaceService.this)).onComplete(i, generateBlob, key, ToygerFaceService.h(ToygerFaceService.this).isUTF8());
                } catch (NullPointerException e) {
                    ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.catchNullException:handleCaptureCompleted:" + e.getMessage());
                }
            }
        });
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        P = 0L;
        O = 0L;
        N = 0L;
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleLog(int i, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357cb4d3", new Object[]{this, new Integer(i), hashMap});
            return;
        }
        Handler handler = this.q;
        if (handler == null) {
            return;
        }
        this.q.dispatchMessage(handler.obtainMessage(b, 0, i, hashMap));
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public boolean handleModelLoad(int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e02d159", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i != 2) {
            return false;
        }
        byte[] bArr = null;
        ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService handleModelLoad start to load model, capacity:" + i);
        String str = this.I.containsKey(ToygerBaseService.KEY_GrayModel_BasePath) ? (String) this.I.get(ToygerBaseService.KEY_GrayModel_BasePath) : "";
        String str2 = this.I.containsKey(ToygerBaseService.KEY_GrayModel_Liveness) ? (String) this.I.get(ToygerBaseService.KEY_GrayModel_Liveness) : "";
        if (this.R.useGrayModel && str != "" && str2 != "") {
            bArr = a(str + "/", str2);
        }
        if (bArr != null) {
            z = Toyger.loadModel(bArr, i);
        } else {
            ToygerLog.e("TOYGER_FLOW_ANDROID", "ToygerFaceService handleModelLoad fail to load gray model, model is null capacity: " + i);
            z = false;
        }
        if (!z) {
            this.J.commonConfig.useXNN = 0;
            this.R.usexnnModel = 0;
            Toyger.config(this, this.J);
            ToygerLog.e("TOYGER_FLOW_ANDROID", "ToygerFaceService handleModelLoad fail to load gray dragonfly model, capacity: " + i);
            return Toyger.loadModel(a(this.F, ToygerBaseService.ASSET_FACE_DRAGONFLY), i);
        }
        ToygerLog.i("ToygerFaceService handleModelLoad succeed, model md5: " + str2);
        this.e.grayModelParamLiveness = str2;
        final Map<String, String> runtimeInfo = Toyger.getRuntimeInfo();
        this.q.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ToygerFaceService.N(ToygerFaceService.this) == null) {
                } else {
                    ((ToygerFaceCallback) ToygerFaceService.O(ToygerFaceService.this)).onEvent(-51, runtimeInfo);
                }
            }
        });
        return z;
    }

    public void addMonitorImage(TGFrame tGFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddfab93", new Object[]{this, tGFrame});
            return;
        }
        FaceBlobManager faceBlobManager = this.e;
        if (faceBlobManager == null) {
            return;
        }
        faceBlobManager.addMonitorImage(tGFrame);
    }

    public void addMonitorImage(TGFrame tGFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de1679a1", new Object[]{this, tGFrame, new Boolean(z)});
            return;
        }
        FaceBlobManager faceBlobManager = this.e;
        if (faceBlobManager == null) {
            return;
        }
        faceBlobManager.addMonitorImage(tGFrame, z);
    }

    public Map<String, Object> generateBlob(Map<String, Object> map) {
        FaceBlobManager faceBlobManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e7858561", new Object[]{this, map});
        }
        Map<String, Object> map2 = null;
        if (map != null && (faceBlobManager = this.e) != null) {
            map2 = faceBlobManager.generateBlob(map);
            byte[] key = this.e.getKey();
            if (map2 != null) {
                map2.put("key", key);
                map2.put(ToygerBaseService.KEY_RES_9_IS_UTF8, Boolean.valueOf(this.e.isUTF8()));
            }
        }
        return map2;
    }

    public Map<String, Object> generateMonitorBlob(boolean z) {
        byte[] monitorBlob;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("96da4400", new Object[]{this, new Boolean(z)});
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = null;
        FaceBlobManager faceBlobManager = this.e;
        if (faceBlobManager != null && (monitorBlob = faceBlobManager.getMonitorBlob(z)) != null) {
            byte[] key = this.e.getKey();
            HashMap hashMap2 = new HashMap(3);
            hashMap2.put("content", monitorBlob);
            hashMap2.put("key", key);
            hashMap2.put(ToygerBaseService.KEY_RES_9_IS_UTF8, Boolean.valueOf(this.e.isUTF8()));
            hashMap = hashMap2;
        }
        ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.generateMonitorBlob time:" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        return hashMap;
    }

    public Map<String, Object> generateVideoFileBlob(String str) {
        byte[] fileIdBlob;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bc64a0e5", new Object[]{this, str});
        }
        long currentTimeMillis = System.currentTimeMillis();
        FaceBlobManager faceBlobManager = this.e;
        if (faceBlobManager == null || (fileIdBlob = faceBlobManager.getFileIdBlob(str)) == null) {
            return null;
        }
        byte[] key = this.e.getKey();
        HashMap hashMap = new HashMap(3);
        hashMap.put("content", fileIdBlob);
        hashMap.put("key", key);
        hashMap.put(ToygerBaseService.KEY_RES_9_IS_UTF8, Boolean.valueOf(this.e.isUTF8()));
        ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.generateVideoFileBlob time:" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        return hashMap;
    }
}
