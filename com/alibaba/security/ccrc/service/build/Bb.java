package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.client.smart.core.core.WuKongNativeManager;
import com.alibaba.security.wukong.behavior.sample.BehaviorRiskSample;
import com.alibaba.security.wukong.config.Algo;
import com.alibaba.security.wukong.model.AudioSample;
import com.alibaba.security.wukong.model.ByteImageSample;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.model.ImageRiskSample;
import com.alibaba.security.wukong.model.TextRiskSample;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCV;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.android.mnncv.MNNCVImage;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.dqy;
import tb.qnt;

/* loaded from: classes3.dex */
public abstract class Bb extends AbstractC1227la implements Eb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3233a = "AbsMNNCVExecutor";
    public final Context b;
    public final String c;
    public final InterfaceC1260wb d;
    public final boolean e;
    public final Algo f;
    public final MNNCVExecutor g;
    public long h;
    public long i;
    public volatile boolean j;
    public String k;
    public final int l;

    public Bb(Context context, Algo algo, InterfaceC1260wb interfaceC1260wb) {
        this.b = context;
        this.f = algo;
        this.d = interfaceC1260wb;
        this.c = algo.code;
        this.e = algo.preRun;
        MRTTaskDescription b = com.taobao.mrt.task.g.a().b(this.c);
        if (b != null) {
            this.k = b.cid;
        }
        this.g = new MNNCVExecutor(this.c);
        this.l = interfaceC1260wb.d();
    }

    private int d(ImageRiskSample imageRiskSample) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1a5254c1", new Object[]{this, imageRiskSample})).intValue() : imageRiskSample.getWidth();
    }

    public static /* synthetic */ Object ipc$super(Bb bb, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private void resetDetectData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eddba23", new Object[]{this});
            return;
        }
        this.h = 0L;
        this.i = 0L;
    }

    @Override // com.alibaba.security.ccrc.service.build.Eb
    public String algoCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bf0c4019", new Object[]{this}) : e();
    }

    @Override // com.alibaba.security.ccrc.service.build.Eb
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : MNNCV.isTaskRunnable(this.c);
    }

    @Override // com.alibaba.security.ccrc.service.build.Eb
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.e;
    }

    public abstract String d();

    @Override // com.alibaba.security.ccrc.service.build.Eb
    public Map<String, Object> detect(CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("928a82f8", new Object[]{this, cCRCRiskSample}) : b(cCRCRiskSample);
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.c;
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1227la
    public boolean loggable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19954f88", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.security.ccrc.service.build.Eb
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        Logging.d(f3233a, String.format("algo %s call release", this.c));
        MNNCVExecutor mNNCVExecutor = this.g;
        if (mNNCVExecutor == null) {
            return;
        }
        mNNCVExecutor.a();
        this.j = false;
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1227la
    public String type() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("426047ff", new Object[]{this}) : dqy.TYPE;
    }

    public static /* synthetic */ void a(Bb bb, String str, String str2, String str3, String str4, boolean z, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e60f8a", new Object[]{bb, str, str2, str3, str4, new Boolean(z), str5});
        } else {
            bb.reportAlgoInitEnd(str, str2, str3, str4, z, str5);
        }
    }

    private void b(String str, InterfaceC1254ub interfaceC1254ub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c9eeaa", new Object[]{this, str, interfaceC1254ub});
            return;
        }
        try {
            resetDetectData();
            if (this.j) {
                interfaceC1254ub.a(true, "");
                if (this.d == null || StringUtils.isEmpty(d())) {
                    return;
                }
                this.d.a(d(), false);
                return;
            }
            this.j = false;
            this.g.a(new zb(this, str, interfaceC1254ub));
        } catch (Exception e) {
            reportAlgoInitEnd(str, this.d.getCcrcCode(), this.c, Log.getStackTraceString(e), false, this.k);
        }
    }

    private int c(ImageRiskSample imageRiskSample) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("191c01e2", new Object[]{this, imageRiskSample})).intValue() : imageRiskSample.getHeight();
    }

    private MNNCVImage e(ImageRiskSample imageRiskSample) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MNNCVImage) ipChange.ipc$dispatch("68bb66a1", new Object[]{this, imageRiskSample}) : imageRiskSample.toMNNCVImage();
    }

    @Override // com.alibaba.security.ccrc.service.build.Eb
    public void a(String str, InterfaceC1254ub interfaceC1254ub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0872e9", new Object[]{this, str, interfaceC1254ub});
        } else if (!b()) {
            interfaceC1254ub.a(false, "task is not runnable");
        } else {
            this.mAlgoInitTime = System.currentTimeMillis();
            b(str, interfaceC1254ub);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.Eb
    public void a(InterfaceC1251tb interfaceC1251tb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9829e", new Object[]{this, interfaceC1251tb});
        } else if (!b()) {
            interfaceC1251tb.a(false, "task is not runnable");
        } else {
            this.g.a(new C1266yb(this, interfaceC1251tb));
        }
    }

    private ByteImageSample a(ByteImageSample byteImageSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteImageSample) ipChange.ipc$dispatch("a90b6e28", new Object[]{this, byteImageSample});
        }
        if (byteImageSample.getFormat() != 2) {
            return byteImageSample;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ByteImageSample byteImageSample2 = new ByteImageSample(byteImageSample.getMetaId(), WuKongNativeManager.a().a(byteImageSample.getData(), byteImageSample.getWidth(), byteImageSample.getHeight(), 5), byteImageSample.getWidth(), byteImageSample.getHeight(), 5);
        byteImageSample2.setExtras(byteImageSample.getExtras());
        Logging.d(f3233a, "nv21 to rgba cost time:" + (System.currentTimeMillis() - currentTimeMillis));
        return byteImageSample2;
    }

    private Map<String, Object> b(CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("161ded37", new Object[]{this, cCRCRiskSample});
        }
        if (cCRCRiskSample instanceof ByteImageSample) {
            cCRCRiskSample = a((ByteImageSample) cCRCRiskSample);
        }
        CCRCRiskSample cCRCRiskSample2 = cCRCRiskSample;
        long currentTimeMillis = System.currentTimeMillis();
        Fb a2 = a(cCRCRiskSample2);
        if (!a2.d()) {
            Logging.e(f3233a, "detect fail ", a2.f3239a);
        }
        reportAlgoDetectEnd(cCRCRiskSample2, this.d.e(), this.d.getCcrcCode(), this.c, a2.c(), System.currentTimeMillis() - currentTimeMillis, a2.d(), a2.b(), this.k, this.d.b());
        return a2.a();
    }

    @Override // com.alibaba.security.ccrc.service.build.Eb
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.k;
    }

    private Fb a(CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fb) ipChange.ipc$dispatch("b44c45bd", new Object[]{this, cCRCRiskSample});
        }
        if (cCRCRiskSample instanceof ImageRiskSample) {
            return a((ImageRiskSample) cCRCRiskSample);
        }
        if (cCRCRiskSample instanceof TextRiskSample) {
            return a((TextRiskSample) cCRCRiskSample);
        }
        if (cCRCRiskSample instanceof AudioSample) {
            return a((AudioSample) cCRCRiskSample);
        }
        if (cCRCRiskSample instanceof BehaviorRiskSample) {
            return a((BehaviorRiskSample) cCRCRiskSample);
        }
        return new Fb(new IllegalStateException("样本不支持Python"));
    }

    private int b(ImageRiskSample imageRiskSample) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("17e5af03", new Object[]{this, imageRiskSample})).intValue() : imageRiskSample.getMNNCVImageFormat();
    }

    private Fb a(BehaviorRiskSample behaviorRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fb) ipChange.ipc$dispatch("4cbae40", new Object[]{this, behaviorRiskSample});
        }
        if (this.g != null) {
            this.h++;
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("text", JsonUtils.toJSONString(behaviorRiskSample.getRawData()));
            Map<String, Object> extras = behaviorRiskSample.getExtras();
            if (extras != null) {
                hashMap.putAll(extras);
            }
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("dataType", "Behavior");
            hashMap2.put("inputData", hashMap);
            return a(hashMap2, currentTimeMillis);
        }
        return new Fb(new IllegalStateException("算法未初始化"));
    }

    private Fb a(AudioSample audioSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fb) ipChange.ipc$dispatch("df77959", new Object[]{this, audioSample});
        }
        if (this.g != null) {
            this.h++;
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("audio", audioSample.toMNNAudioData());
            Map<String, Object> extras = audioSample.getExtras();
            if (extras != null) {
                hashMap.putAll(extras);
            }
            hashMap.put(com.taobao.android.weex_framework.util.a.ATOM_length, Integer.valueOf(audioSample.getLength()));
            hashMap.put("sampleRate", Integer.valueOf(audioSample.getAudioSampleConfig().getSampleRate()));
            hashMap.put("channel", Integer.valueOf(audioSample.getAudioSampleConfig().getChannel()));
            hashMap.put("format", Integer.valueOf(audioSample.getAudioSampleConfig().getAudioFormat().value));
            hashMap.put("bitWidth", Integer.valueOf(audioSample.getAudioSampleConfig().getBitWidth().value));
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("dataType", "Audio");
            hashMap2.put("inputData", hashMap);
            return a(hashMap2, currentTimeMillis);
        }
        return new Fb(new IllegalStateException("算法未初始化"));
    }

    private Fb a(TextRiskSample textRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fb) ipChange.ipc$dispatch("6f392079", new Object[]{this, textRiskSample});
        }
        if (this.g != null) {
            this.h++;
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("text", textRiskSample.getText().getContent());
            Map<String, Object> extras = textRiskSample.getExtras();
            if (extras != null) {
                hashMap.putAll(extras);
            }
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("dataType", qnt.TYPE_TEXT);
            hashMap2.put("inputData", hashMap);
            return a(hashMap2, currentTimeMillis);
        }
        return new Fb(new IllegalStateException("算法未初始化"));
    }

    private Fb a(HashMap<String, Object> hashMap, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fb) ipChange.ipc$dispatch("6a496425", new Object[]{this, hashMap, new Long(j)});
        }
        Fb a2 = a(hashMap);
        this.i = (System.currentTimeMillis() - j) + this.i;
        this.d.a(algoCode());
        return a2;
    }

    private Fb a(ImageRiskSample imageRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fb) ipChange.ipc$dispatch("1eeb84cd", new Object[]{this, imageRiskSample});
        }
        if (this.g != null) {
            this.h++;
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put(com.etao.feimagesearch.mnn.utils.a.f6802a, imageRiskSample.toMNNCVImage());
            hashMap.put(com.etao.feimagesearch.mnn.utils.a.d, Integer.valueOf(imageRiskSample.getMNNCVImageFormat()));
            hashMap.put(com.etao.feimagesearch.mnn.utils.a.c, Integer.valueOf(imageRiskSample.getWidth()));
            hashMap.put(com.etao.feimagesearch.mnn.utils.a.b, Integer.valueOf(imageRiskSample.getHeight()));
            Map<String, Object> extras = imageRiskSample.getExtras();
            if (extras != null) {
                hashMap.putAll(extras);
            }
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("dataType", "videoFrame");
            hashMap2.put("inputData", hashMap);
            return a(hashMap2, currentTimeMillis);
        }
        return new Fb(new IllegalStateException("算法未初始化"));
    }

    public Fb a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fb) ipChange.ipc$dispatch("ec8ad361", new Object[]{this, map});
        }
        Fb fb = new Fb(new RuntimeException("mnn process time out 10s"));
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.g.a(map, new Ab(this, fb, countDownLatch));
        try {
            countDownLatch.await(this.l, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Logging.w(f3233a, e.getMessage());
        }
        return fb;
    }

    @Override // com.alibaba.security.ccrc.service.build.Eb
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.f.isSupport(str);
    }
}
