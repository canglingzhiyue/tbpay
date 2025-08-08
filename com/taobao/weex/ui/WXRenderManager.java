package com.taobao.weex.ui;

import android.opengl.GLES10;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXRuntimeException;
import com.taobao.weex.common.WXThread;
import com.taobao.weex.dom.RenderContext;
import com.taobao.weex.performance.f;
import com.taobao.weex.ui.action.BasicGraphicAction;
import com.taobao.weex.ui.action.GraphicActionBatchAction;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.utils.WXExceptionUtils;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import tb.kge;

/* loaded from: classes.dex */
public class WXRenderManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static int mOpenGLRenderLimitValue = 0;
    private static int nativeBatchTimes = 0;
    private static final String sKeyAction = "Action";
    private String mCurrentBatchInstanceId = null;
    private ArrayList<Map<String, Object>> mBatchActions = new ArrayList<>();
    private final int MAX_DROP_FRAME_NATIVE_BATCH = 2000;
    private volatile ConcurrentHashMap<String, RenderContextImpl> mRenderContext = new ConcurrentHashMap<>();
    private WXRenderHandler mWXRenderHandler = new WXRenderHandler();

    static {
        kge.a(795073430);
        nativeBatchTimes = 0;
        mOpenGLRenderLimitValue = 0;
    }

    public RenderContext getRenderContext(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RenderContext) ipChange.ipc$dispatch("f4b50134", new Object[]{this, str}) : this.mRenderContext.get(str);
    }

    public WXComponent getWXComponent(String str, String str2) {
        RenderContext renderContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("fea6387a", new Object[]{this, str, str2});
        }
        if (str != null && !StringUtils.isEmpty(str2) && (renderContext = getRenderContext(str)) != null) {
            return renderContext.getComponent(str2);
        }
        return null;
    }

    public WXSDKInstance getWXSDKInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("19930167", new Object[]{this, str});
        }
        RenderContextImpl renderContextImpl = this.mRenderContext.get(str);
        if (renderContextImpl != null) {
            return renderContextImpl.getWXSDKInstance();
        }
        return null;
    }

    public static int getOpenGLRenderLimitValue() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e25c326b", new Object[0])).intValue();
        }
        if (mOpenGLRenderLimitValue == 0) {
            try {
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                egl10.eglInitialize(eglGetDisplay, new int[2]);
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr = new int[1];
                egl10.eglChooseConfig(eglGetDisplay, new int[]{12351, 12430, 12329, 0, 12339, 1, 12344}, eGLConfigArr, 1, iArr);
                if (iArr[0] == 0) {
                    i = -1;
                    egl10.eglTerminate(eglGetDisplay);
                } else {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344});
                    EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 1, 12344});
                    egl10.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
                    int[] iArr2 = new int[1];
                    GLES10.glGetIntegerv(3379, iArr2, 0);
                    EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                    egl10.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                    egl10.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
                    egl10.eglDestroyContext(eglGetDisplay, eglCreateContext);
                    egl10.eglTerminate(eglGetDisplay);
                    i = iArr2[0];
                }
            } catch (Exception e) {
                WXLogUtils.e(WXLogUtils.getStackTrace(e));
            }
            mOpenGLRenderLimitValue = i;
        }
        return mOpenGLRenderLimitValue;
    }

    public void postOnUiThread(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa4df02", new Object[]{this, runnable, new Long(j)});
        } else {
            this.mWXRenderHandler.postDelayed(WXThread.secure(runnable), j);
        }
    }

    public void postOnUiThread(Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed2854c", new Object[]{this, runnable, str});
        } else {
            this.mWXRenderHandler.post(str, WXThread.secure(runnable));
        }
    }

    public void postOnUiThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c62e9802", new Object[]{this, runnable});
        } else {
            this.mWXRenderHandler.post(WXThread.secure(runnable));
        }
    }

    public void removeTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463afaae", new Object[]{this, runnable});
        } else {
            this.mWXRenderHandler.removeCallbacks(runnable);
        }
    }

    public void removeRenderStatement(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61667426", new Object[]{this, str});
        } else if (!WXUtils.isUiThread()) {
            throw new WXRuntimeException("[WXRenderManager] removeRenderStatement can only be called in main thread");
        } else {
            RenderContextImpl remove = this.mRenderContext.remove(str);
            if (remove != null) {
                remove.destroy();
            }
            if (str == null) {
                this.mWXRenderHandler.removeCallbacksAndMessages(null);
            } else {
                this.mWXRenderHandler.removeMessages(str.hashCode());
            }
        }
    }

    private void postAllStashedGraphicAction(String str, BasicGraphicAction basicGraphicAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32085162", new Object[]{this, str, basicGraphicAction});
            return;
        }
        RenderContextImpl renderContextImpl = this.mRenderContext.get(str);
        ArrayList arrayList = renderContextImpl != null ? new ArrayList(this.mBatchActions) : null;
        this.mBatchActions.clear();
        this.mCurrentBatchInstanceId = null;
        nativeBatchTimes = 0;
        if (renderContextImpl == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = ((Map) arrayList.get(i)).get(sKeyAction);
            if (obj instanceof BasicGraphicAction) {
                BasicGraphicAction basicGraphicAction2 = (BasicGraphicAction) obj;
                if (basicGraphicAction2.mActionType != 1 && basicGraphicAction2.mActionType != 2) {
                    arrayList2.add(basicGraphicAction2);
                }
            }
        }
        postGraphicAction(str, new GraphicActionBatchAction(basicGraphicAction.getWXSDKIntance(), basicGraphicAction.getRef(), arrayList2));
    }

    public void postGraphicAction(String str, BasicGraphicAction basicGraphicAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e6415", new Object[]{this, str, basicGraphicAction});
        } else if (this.mRenderContext.get(str) == null) {
        } else {
            String str2 = this.mCurrentBatchInstanceId;
            if (str2 != null && str != null && !str2.equals(str) && this.mBatchActions.size() > 0) {
                ArrayList<Map<String, Object>> arrayList = this.mBatchActions;
                Object obj = arrayList.get(arrayList.size() - 1).get(sKeyAction);
                if (obj instanceof BasicGraphicAction) {
                    postAllStashedGraphicAction(this.mCurrentBatchInstanceId, (BasicGraphicAction) obj);
                }
            }
            if (basicGraphicAction.mActionType == 2) {
                postAllStashedGraphicAction(str, basicGraphicAction);
                return;
            }
            if (basicGraphicAction.mActionType == 1 || this.mBatchActions.size() > 0) {
                int i = nativeBatchTimes + 1;
                nativeBatchTimes = i;
                if (i > 2000) {
                    postAllStashedGraphicAction(str, basicGraphicAction);
                } else {
                    HashMap hashMap = new HashMap(1);
                    hashMap.put(sKeyAction, basicGraphicAction);
                    this.mBatchActions.add(hashMap);
                    this.mCurrentBatchInstanceId = str;
                    return;
                }
            }
            this.mWXRenderHandler.post(str, basicGraphicAction);
        }
    }

    public void registerInstance(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a0412f", new Object[]{this, wXSDKInstance});
        } else if (wXSDKInstance.N() == null) {
            WXErrorCode wXErrorCode = WXErrorCode.WX_RENDER_ERR_INSTANCE_ID_NULL;
            WXExceptionUtils.commitCriticalExceptionRT(null, wXErrorCode, "registerInstance", WXErrorCode.WX_RENDER_ERR_INSTANCE_ID_NULL.getErrorMsg() + "instanceId is null", null);
        } else {
            this.mRenderContext.put(wXSDKInstance.N(), new RenderContextImpl(wXSDKInstance));
        }
    }

    public List<WXSDKInstance> getAllInstances() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("82b53ad", new Object[]{this});
        }
        ArrayList arrayList = null;
        if (this.mRenderContext != null && !this.mRenderContext.isEmpty()) {
            arrayList = new ArrayList();
            for (Map.Entry<String, RenderContextImpl> entry : this.mRenderContext.entrySet()) {
                RenderContextImpl value = entry.getValue();
                if (value != null) {
                    arrayList.add(value.getWXSDKInstance());
                }
            }
        }
        return arrayList;
    }

    public void registerComponent(String str, String str2, WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd55c85a", new Object[]{this, str, str2, wXComponent});
            return;
        }
        RenderContextImpl renderContextImpl = this.mRenderContext.get(str);
        if (renderContextImpl == null) {
            return;
        }
        renderContextImpl.registerComponent(str2, wXComponent);
        if (renderContextImpl.getInstance() == null) {
            return;
        }
        renderContextImpl.getInstance().ar().d(f.KEY_PAGE_STATS_MAX_COMPONENT_NUM, renderContextImpl.getComponentCount());
    }

    public WXComponent unregisterComponent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("2709fbbf", new Object[]{this, str, str2});
        }
        RenderContextImpl renderContextImpl = this.mRenderContext.get(str);
        if (renderContextImpl == null) {
            return null;
        }
        if (renderContextImpl.getInstance() != null) {
            renderContextImpl.getInstance().ar().d(f.KEY_PAGE_STATS_MAX_COMPONENT_NUM, renderContextImpl.getComponentCount());
        }
        return renderContextImpl.unregisterComponent(str2);
    }
}
