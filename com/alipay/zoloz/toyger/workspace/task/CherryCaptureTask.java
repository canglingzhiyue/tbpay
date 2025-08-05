package com.alipay.zoloz.toyger.workspace.task;

import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.task.ActionFrame;
import com.alipay.mobile.security.bio.task.ActionType;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.faceauth.FaceDetectType;
import com.alipay.zoloz.toyger.bean.FrameType;
import com.alipay.zoloz.toyger.bean.ToygerFrame;
import com.alipay.zoloz.toyger.extservice.record.ToygerRecordService;
import com.alipay.zoloz.toyger.interfaces.ToygerCallback;
import com.alipay.zoloz.toyger.widget.CircleUploadPattern;
import com.alipay.zoloz.toyger.widget.ToygerCirclePattern;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class CherryCaptureTask extends ToygerBaseTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean B;
    private String C;
    private String D;
    private int E;
    private boolean F;
    private ToygerRecordService G;
    private float H;
    private boolean I;
    private boolean J;

    public static /* synthetic */ Object ipc$super(CherryCaptureTask cherryCaptureTask, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 267248010:
                return new Integer(super.init());
            case 445311252:
                return super.action((ActionFrame) objArr[0]);
            case 1159927548:
                return new Integer(super.done());
            case 1713617801:
                super.stop();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ boolean a(CherryCaptureTask cherryCaptureTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("29728e64", new Object[]{cherryCaptureTask})).booleanValue() : cherryCaptureTask.J;
    }

    public static /* synthetic */ boolean a(CherryCaptureTask cherryCaptureTask, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dff078", new Object[]{cherryCaptureTask, new Boolean(z)})).booleanValue();
        }
        cherryCaptureTask.F = z;
        return z;
    }

    public CherryCaptureTask(BioServiceManager bioServiceManager, ToygerCirclePattern toygerCirclePattern, Handler handler, ToygerCallback toygerCallback) {
        super(bioServiceManager, toygerCirclePattern, handler, toygerCallback);
        this.F = false;
        this.H = 0.0f;
        this.I = false;
        this.J = false;
        this.G = (ToygerRecordService) bioServiceManager.getBioService(ToygerRecordService.class);
        this.c = new Handler(Looper.getMainLooper());
        this.B = this.m.getColl().isProgressbar();
        this.C = this.m.getColl().getBottomText();
        this.D = this.m.getColl().getTopText();
        this.E = this.m.getColl().getImageIndex();
        Map<String, String> extProperty = toygerCallback.getAppDescription().getExtProperty();
        if (extProperty != null && !extProperty.isEmpty() && extProperty.containsKey(BioDetector.EXT_KEY_AUTH_IN_BACKGROUND)) {
            this.I = Boolean.parseBoolean(extProperty.get(BioDetector.EXT_KEY_AUTH_IN_BACKGROUND));
        } else {
            this.I = false;
        }
    }

    @Override // com.alipay.zoloz.toyger.workspace.task.ToygerBaseTask, com.alipay.mobile.security.bio.task.SubTask
    public int init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fede18a", new Object[]{this})).intValue();
        }
        this.v = "cherryDetectTask";
        if (this.d != null) {
            this.d.setDetectType(FaceDetectType.BLINK);
        }
        this.f6371a.showProcessBar(0.0f);
        this.f6371a.getTitleBar().setVisibility(0);
        this.f6371a.getTitleBar().setSoundButton(8);
        this.i.setVisibility(0);
        this.j.setVisibility(8);
        this.f6371a.getOuterBakRoundProgressBar().setRoundColor(Color.parseColor("#E5BA84"));
        this.f6371a.getGuassianBackground().setVisibility(8);
        ToygerRecordService toygerRecordService = this.G;
        if (toygerRecordService != null) {
            toygerRecordService.write(ToygerRecordService.DETECT_COND_START);
        }
        if (!StringUtil.isNullorEmpty(this.C)) {
            this.A.setText(this.C);
        }
        if (!StringUtil.isNullorEmpty(this.D)) {
            this.k.setText(this.D);
        }
        return super.init();
    }

    @Override // com.alipay.zoloz.toyger.workspace.task.ToygerBaseTask, com.alipay.mobile.security.bio.task.SubTask
    public ActionType action(ActionFrame actionFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionType) ipChange.ipc$dispatch("1a8ae914", new Object[]{this, actionFrame});
        }
        ToygerFrame toygerFrame = (ToygerFrame) actionFrame.getObject();
        BioLog.w("TOYGER_FLOW_ANDROID", "CherryCaptureTask.action(): frameType = " + toygerFrame.frameType);
        if (toygerFrame.frameType == FrameType.COMPLETED) {
            if (this.l != null) {
                this.l.sendEmptyMessage(1);
            }
            this.w = toygerFrame;
            if (this.w != null) {
                this.H = this.w.tgFaceAttr.quality;
            }
            BioLog.e("TOYGER_FLOW_ANDROID", "FrameType.FRAME : mBestToygerFrame = toygerFrame : " + this.w);
            if (this.I) {
                return ActionType.DONE;
            }
            this.c.postDelayed(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.task.CherryCaptureTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (CherryCaptureTask.a(CherryCaptureTask.this)) {
                    } else {
                        CherryCaptureTask.this.f6371a.getTitleBar().setSoundButton(8);
                        CircleUploadPattern circleUploadPattern = CherryCaptureTask.this.f6371a.getCircleUploadPattern();
                        if (circleUploadPattern != null) {
                            circleUploadPattern.setVisibility(0);
                        }
                        CherryCaptureTask.this.f6371a.getTitleBar().setCloseButtonVisible(8);
                        CherryCaptureTask.this.f6371a.setTopTipViewsetVisibility(8);
                        CherryCaptureTask.this.f6371a.setMaskViewsetVisibility(8);
                        CherryCaptureTask.this.f6371a.getOuterBakRoundProgressBar().setRoundColor(Color.parseColor("#414146"));
                        CherryCaptureTask.this.f6371a.getOuterBakRoundProgressBar().setCricleProgressColor(Color.parseColor("#414146"));
                        CherryCaptureTask.this.f6371a.getRoundProgressBar().setVisibility(8);
                        if (CherryCaptureTask.this.w == null) {
                            return;
                        }
                        CherryCaptureTask cherryCaptureTask = CherryCaptureTask.this;
                        cherryCaptureTask.a(cherryCaptureTask.w.bestBitmap);
                    }
                }
            }, 300L);
            return ActionType.DONE;
        } else if (toygerFrame.frameType == FrameType.FRAME) {
            if (this.f6371a != null) {
                this.f6371a.getTitleBar().setVisibility(8);
                this.f6371a.showProcessBar(1.0f, 50, true);
                this.f6371a.getTitleBar().setSoundButton(8);
                this.f6371a.onProcessing();
            }
            return ActionType.RUN;
        } else if (toygerFrame.frameType == FrameType.DARK) {
            this.J = true;
            if (this.f6371a != null) {
                this.f6371a.getTitleBar().setVisibility(8);
                this.f6371a.showProcessBar(1.0f, 50, true);
                this.c.postDelayed(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.task.CherryCaptureTask.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        CherryCaptureTask.this.f6371a.getTitleBar().setSoundButton(8);
                        CircleUploadPattern circleUploadPattern = CherryCaptureTask.this.f6371a.getCircleUploadPattern();
                        if (circleUploadPattern != null) {
                            circleUploadPattern.setBackgroundColor(Color.parseColor("#DA000000"));
                            circleUploadPattern.setVisibility(0);
                        }
                        CherryCaptureTask.this.f6371a.getTitleBar().setCloseButtonVisible(8);
                        CherryCaptureTask.this.f6371a.setTopTipViewsetVisibility(8);
                        CherryCaptureTask.this.f6371a.setMaskViewsetVisibility(8);
                        CherryCaptureTask.this.f6371a.getOuterBakRoundProgressBar().setRoundColor(Color.parseColor("#414146"));
                        CherryCaptureTask.this.f6371a.getOuterBakRoundProgressBar().setCricleProgressColor(Color.parseColor("#414146"));
                        CherryCaptureTask.this.f6371a.getRoundProgressBar().setVisibility(8);
                    }
                }, 300L);
            }
            if (this.l != null) {
                this.l.sendEmptyMessage(2);
            }
            return ActionType.RUN;
        } else {
            if (toygerFrame.frameType == FrameType.STATE) {
                if (toygerFrame.tgFaceState.hasFace) {
                    this.f6371a.showProcessBar(toygerFrame.tgFaceState.progress);
                } else if (this.F) {
                    return ActionType.RUN;
                } else {
                    this.F = true;
                    this.c.postDelayed(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.task.CherryCaptureTask.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                CherryCaptureTask.a(CherryCaptureTask.this, false);
                            }
                        }
                    }, 500L);
                    this.f6371a.showProcessBar(0.0f, 50, true);
                }
            }
            return super.action(actionFrame);
        }
    }

    @Override // com.alipay.zoloz.toyger.workspace.task.ToygerBaseTask, com.alipay.mobile.security.bio.task.SubTask
    public int done() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("452316fc", new Object[]{this})).intValue();
        }
        this.u = System.currentTimeMillis();
        a();
        return super.done();
    }

    @Override // com.alipay.zoloz.toyger.workspace.task.ToygerBaseTask
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            super.stop();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.n.extInfo = String.format(this.p, Integer.valueOf(this.q), Integer.valueOf(this.r), Integer.valueOf(this.s));
        BioLog.i("BisBehavTask:" + this.n.extInfo);
        this.n.quality = (int) this.H;
        this.n.name = this.v;
        this.n.idx = "0";
        this.n.dur = (int) (this.u - this.t);
    }
}
