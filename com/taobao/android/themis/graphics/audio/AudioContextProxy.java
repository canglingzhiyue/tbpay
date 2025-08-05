package com.taobao.android.themis.graphics.audio;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class AudioContextProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ThreadPoolExecutor executorService;
    private final a audioContext;

    public static native void nativeFireEvent(long j, String str, String str2);

    public static /* synthetic */ a access$000(AudioContextProxy audioContextProxy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1837e2d3", new Object[]{audioContextProxy}) : audioContextProxy.audioContext;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 3L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "audiocontext_jsbinding");
            }
        });
        executorService = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    private <T> T excuteTaskForResult(Callable<T> callable, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d7ad7f7", new Object[]{this, callable, t});
        }
        ThreadPoolExecutor threadPoolExecutor = executorService;
        if (threadPoolExecutor == null) {
            return t;
        }
        try {
            return threadPoolExecutor.submit(callable).get();
        } catch (InterruptedException | ExecutionException unused) {
            return t;
        }
    }

    private void excuteTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd9d4c0", new Object[]{this, runnable});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = executorService;
        if (threadPoolExecutor == null) {
            return;
        }
        threadPoolExecutor.execute(runnable);
    }

    public AudioContextProxy(a aVar, long j) {
        this.audioContext = aVar;
        a aVar2 = this.audioContext;
        if (aVar2 != null) {
            aVar2.a(j);
        }
    }

    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            excuteTask(new Runnable() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (AudioContextProxy.access$000(AudioContextProxy.this) == null) {
                    } else {
                        AudioContextProxy.access$000(AudioContextProxy.this).a();
                    }
                }
            });
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            excuteTask(new Runnable() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (AudioContextProxy.access$000(AudioContextProxy.this) == null) {
                    } else {
                        AudioContextProxy.access$000(AudioContextProxy.this).b();
                    }
                }
            });
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            excuteTask(new Runnable() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (AudioContextProxy.access$000(AudioContextProxy.this) == null) {
                    } else {
                        AudioContextProxy.access$000(AudioContextProxy.this).c();
                    }
                }
            });
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        a aVar = this.audioContext;
        if (aVar != null) {
            aVar.f15545a = -1L;
        }
        excuteTask(new Runnable() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (AudioContextProxy.access$000(AudioContextProxy.this) == null) {
                } else {
                    AudioContextProxy.access$000(AudioContextProxy.this).d();
                }
            }
        });
    }

    public void seek(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9bfbe4", new Object[]{this, new Integer(i)});
        } else {
            excuteTask(new Runnable() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (AudioContextProxy.access$000(AudioContextProxy.this) == null) {
                    } else {
                        AudioContextProxy.access$000(AudioContextProxy.this).b(i);
                    }
                }
            });
        }
    }

    public void setSrc(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            excuteTask(new Runnable() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (AudioContextProxy.access$000(AudioContextProxy.this) == null) {
                    } else {
                        AudioContextProxy.access$000(AudioContextProxy.this).a(str);
                    }
                }
            });
        }
    }

    public void setStartTime(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c9436f", new Object[]{this, new Integer(i)});
        } else {
            excuteTask(new Runnable() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (AudioContextProxy.access$000(AudioContextProxy.this) == null) {
                    } else {
                        AudioContextProxy.access$000(AudioContextProxy.this).a(i);
                    }
                }
            });
        }
    }

    public void setAutoPlay(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            excuteTask(new Runnable() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (AudioContextProxy.access$000(AudioContextProxy.this) == null) {
                    } else {
                        AudioContextProxy.access$000(AudioContextProxy.this).a(z);
                    }
                }
            });
        }
    }

    public void setLoop(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
        } else {
            excuteTask(new Runnable() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (AudioContextProxy.access$000(AudioContextProxy.this) == null) {
                    } else {
                        AudioContextProxy.access$000(AudioContextProxy.this).b(z);
                    }
                }
            });
        }
    }

    public void setObeyMuteSwitch(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1756017", new Object[]{this, new Boolean(z)});
        } else {
            excuteTask(new Runnable() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (AudioContextProxy.access$000(AudioContextProxy.this) == null) {
                    } else {
                        AudioContextProxy.access$000(AudioContextProxy.this).c(z);
                    }
                }
            });
        }
    }

    public void setVolume(final float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
        } else {
            excuteTask(new Runnable() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (AudioContextProxy.access$000(AudioContextProxy.this) == null) {
                    } else {
                        AudioContextProxy.access$000(AudioContextProxy.this).a(f);
                    }
                }
            });
        }
    }

    public void setIsRecordPlayState(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d7158d", new Object[]{this, new Boolean(z)});
        } else {
            excuteTask(new Runnable() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (AudioContextProxy.access$000(AudioContextProxy.this) == null) {
                    } else {
                        AudioContextProxy.access$000(AudioContextProxy.this).d(z);
                    }
                }
            });
        }
    }

    public float getDuration() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed837a81", new Object[]{this})).floatValue() : ((Float) excuteTaskForResult(new Callable<Float>() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Float, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public /* synthetic */ Float call() throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
            }

            public Float a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Float) ipChange2.ipc$dispatch("62a8d0b1", new Object[]{this});
                }
                if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                    return Float.valueOf(AudioContextProxy.access$000(AudioContextProxy.this).e());
                }
                return Float.valueOf(0.0f);
            }
        }, Float.valueOf(0.0f))).floatValue();
    }

    public float getCurrentTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eecf1327", new Object[]{this})).floatValue() : ((Float) excuteTaskForResult(new Callable<Float>() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Float, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public /* synthetic */ Float call() throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
            }

            public Float a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Float) ipChange2.ipc$dispatch("62a8d0b1", new Object[]{this});
                }
                if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                    return Float.valueOf(AudioContextProxy.access$000(AudioContextProxy.this).f());
                }
                return Float.valueOf(0.0f);
            }
        }, Float.valueOf(0.0f))).floatValue();
    }

    public boolean isPaused() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7ec0d383", new Object[]{this})).booleanValue() : ((Boolean) excuteTaskForResult(new Callable<Boolean>() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public /* synthetic */ Boolean call() throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
            }

            public Boolean a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Boolean) ipChange2.ipc$dispatch("5b7a33e5", new Object[]{this});
                }
                if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                    return Boolean.valueOf(AudioContextProxy.access$000(AudioContextProxy.this).g());
                }
                return false;
            }
        }, false)).booleanValue();
    }

    public int getBufferd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9ce40d68", new Object[]{this})).intValue() : ((Integer) excuteTaskForResult(new Callable<Integer>() { // from class: com.taobao.android.themis.graphics.audio.AudioContextProxy.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Integer] */
            @Override // java.util.concurrent.Callable
            public /* synthetic */ Integer call() throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
            }

            public Integer a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Integer) ipChange2.ipc$dispatch("5e2c18f", new Object[]{this});
                }
                if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                    return Integer.valueOf(AudioContextProxy.access$000(AudioContextProxy.this).h());
                }
                return 0;
            }
        }, 0)).intValue();
    }
}
