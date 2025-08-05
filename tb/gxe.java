package tb;

import android.content.Context;
import com.alibaba.marvel.java.OnNativeDataCallback;
import com.alibaba.marvel.toolbox.SeparateParam;
import com.alibaba.marvel.toolbox.ToolBox;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.au;
import com.taobao.android.litecreator.util.k;
import com.taobao.android.litecreator.util.n;
import java.io.File;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class gxe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int CODE_SUCCESS = 0;

    /* loaded from: classes5.dex */
    public interface a {
        void a(String str);

        void a(String str, String str2);
    }

    static {
        kge.a(-517119126);
    }

    public void a(Context context, String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643adb29", new Object[]{this, context, str, aVar});
            return;
        }
        SeparateParam separateParam = new SeparateParam(str);
        final String a2 = n.a(context, ".aac");
        separateParam.output = a2;
        separateParam.startTimeUs = 10L;
        separateParam.sampleRate = 16000;
        separateParam.channelCount = 1;
        separateParam.endTimeUs = 6000000L;
        ToolBox.separateAudio(separateParam, new OnNativeDataCallback() { // from class: tb.gxe.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public boolean onFrame(ByteBuffer byteBuffer, long j, long j2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("2371b1a0", new Object[]{this, byteBuffer, new Long(j), new Long(j2)})).booleanValue();
                }
                return true;
            }

            public void onEnd(final int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91e6a60", new Object[]{this, new Integer(i)});
                } else if (i == 0) {
                    try {
                        au.a(new Runnable() { // from class: tb.gxe.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    aVar.a(a2);
                                }
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    au.a(new Runnable() { // from class: tb.gxe.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                aVar.a(String.valueOf(i), "size <= 0 ");
                            }
                        }
                    });
                }
            }
        });
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        byte[] b = k.b(new File(str));
        return (b == null || b.length <= 0) ? "" : new String(android.taobao.util.a.a(b));
    }
}
