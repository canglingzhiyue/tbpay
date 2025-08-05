package com.etao.feimagesearch.pipline;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import tb.kge;

/* loaded from: classes3.dex */
public final class NodeType {
    public static final NodeType INSTANCE;
    public static final String NODE_COMMON_REQUEST = "CommonRequest";
    public static final String NODE_IMAGE_CHANNEL_DETECT = "ImageChannelDetect";
    public static final String NODE_IMAGE_CODE_DETECT = "ImageCodeDetect";
    public static final String NODE_IMAGE_CROP = "ImageCrop";
    public static final String NODE_IMAGE_DETECT = "ImageDetect";
    public static final String NODE_IMAGE_FEATURE_EXTRACT = "ImageFeatureExtract";
    public static final String NODE_IMAGE_LOAD = "ImageLoad";
    public static final String NODE_IMAGE_MOCK_RESPONSE = "ImageMockResponse";
    public static final String NODE_IMAGE_MOCK_SEARCH = "ImageMockSearch";
    public static final String NODE_IMAGE_PROCESS = "ImageProcess";
    public static final String NODE_IMAGE_SEARCH = "ImageSearch";
    public static final String NODE_INVALID = "Invalid";
    public static final String NODE_UNKNOWN = "Unknown";

    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* renamed from: com.etao.feimagesearch.pipline.NodeType$NodeType  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public @interface InterfaceC0242NodeType {
    }

    static {
        kge.a(243635119);
        INSTANCE = new NodeType();
    }

    private NodeType() {
    }
}
