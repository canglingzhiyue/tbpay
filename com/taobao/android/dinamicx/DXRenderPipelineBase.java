package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes.dex */
public class DXRenderPipelineBase extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DXPIPELINE_STAGE_DIFF = 6;
    public static final int DXPIPELINE_STAGE_EFFECT = 8;
    public static final int DXPIPELINE_STAGE_END = 9;
    public static final int DXPIPELINE_STAGE_FLATTEN = 5;
    public static final int DXPIPELINE_STAGE_ID_LE = 0;
    public static final int DXPIPELINE_STAGE_LAYOUT = 4;
    public static final int DXPIPELINE_STAGE_LOAD = 1;
    public static final int DXPIPELINE_STAGE_MEASURE = 3;
    public static final int DXPIPELINE_STAGE_PARSE = 2;
    public static final int DXPIPELINE_STAGE_RENDER = 7;
    public int l;
    public String m;
    public DXRenderPipelineFlow n;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DXPipelineStage {
    }

    static {
        kge.a(-681243312);
    }

    public void a(DXRenderPipelineFlow dXRenderPipelineFlow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a615be8a", new Object[]{this, dXRenderPipelineFlow});
        } else {
            this.n = dXRenderPipelineFlow;
        }
    }

    public DXRenderPipelineBase(r rVar) {
        super(rVar);
    }

    public DXRenderPipelineBase(r rVar, int i, String str) {
        super(rVar);
        this.l = i;
        this.m = str;
    }

    public int a(DXWidgetNode dXWidgetNode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c642f80f", new Object[]{this, dXWidgetNode, new Integer(i)})).intValue();
        }
        if (dXWidgetNode == null) {
            return 1;
        }
        if (dXWidgetNode.getStatInPrivateFlags(1024) || dXWidgetNode.getStatInPrivateFlags(1)) {
            return 2;
        }
        if (dXWidgetNode.getStatInPrivateFlags(4) || dXWidgetNode.getStatInPrivateFlags(16384)) {
            return 3;
        }
        if (dXWidgetNode.getStatInPrivateFlags(16)) {
            return 4;
        }
        if (!dXWidgetNode.getStatInPrivateFlags(32)) {
            return i;
        }
        return 5;
    }
}
