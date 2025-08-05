package com.alipay.biometrics.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.mobile.security.bio.utils.DeviceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class AlgorithmInfoPattern extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView mTxtCode;
    private TextView mTxtDistance;
    private TextView mTxtFaceID;
    private TextView mTxtFaceLight;
    private TextView mTxtFacePitch;
    private TextView mTxtFaceQuality;
    private TextView mTxtFaceYaw;
    private TextView mTxtGaussian;
    private TextView mTxtHasFace;
    private TextView mTxtIntegrity;
    private TextView mTxtLeftEyeOcclusion;
    private TextView mTxtLiveScore;
    private TextView mTxtMotion;
    private TextView mTxtRectWidth;
    private TextView mTxtRightEyeOcclusion;
    private TextView mTxtVersionName;

    public AlgorithmInfoPattern(Context context) {
        super(context);
        this.mTxtHasFace = null;
        this.mTxtFaceID = null;
        this.mTxtFaceQuality = null;
        this.mTxtLiveScore = null;
        this.mTxtFaceLight = null;
        this.mTxtIntegrity = null;
        this.mTxtFacePitch = null;
        this.mTxtFaceYaw = null;
        this.mTxtGaussian = null;
        this.mTxtMotion = null;
        this.mTxtLeftEyeOcclusion = null;
        this.mTxtRightEyeOcclusion = null;
        this.mTxtDistance = null;
        this.mTxtRectWidth = null;
        this.mTxtVersionName = null;
        this.mTxtCode = null;
        initViews();
    }

    public AlgorithmInfoPattern(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTxtHasFace = null;
        this.mTxtFaceID = null;
        this.mTxtFaceQuality = null;
        this.mTxtLiveScore = null;
        this.mTxtFaceLight = null;
        this.mTxtIntegrity = null;
        this.mTxtFacePitch = null;
        this.mTxtFaceYaw = null;
        this.mTxtGaussian = null;
        this.mTxtMotion = null;
        this.mTxtLeftEyeOcclusion = null;
        this.mTxtRightEyeOcclusion = null;
        this.mTxtDistance = null;
        this.mTxtRectWidth = null;
        this.mTxtVersionName = null;
        this.mTxtCode = null;
        initViews();
    }

    public AlgorithmInfoPattern(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTxtHasFace = null;
        this.mTxtFaceID = null;
        this.mTxtFaceQuality = null;
        this.mTxtLiveScore = null;
        this.mTxtFaceLight = null;
        this.mTxtIntegrity = null;
        this.mTxtFacePitch = null;
        this.mTxtFaceYaw = null;
        this.mTxtGaussian = null;
        this.mTxtMotion = null;
        this.mTxtLeftEyeOcclusion = null;
        this.mTxtRightEyeOcclusion = null;
        this.mTxtDistance = null;
        this.mTxtRectWidth = null;
        this.mTxtVersionName = null;
        this.mTxtCode = null;
        initViews();
    }

    private void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.bio_algorithm_info, (ViewGroup) this, true);
        this.mTxtHasFace = (TextView) inflate.findViewById(R.id.face_circle_has_face);
        this.mTxtFaceID = (TextView) inflate.findViewById(R.id.face_circle_face_id);
        this.mTxtFaceQuality = (TextView) inflate.findViewById(R.id.face_circle_face_quality);
        this.mTxtLiveScore = (TextView) inflate.findViewById(R.id.face_circle_face_live_score);
        this.mTxtFaceLight = (TextView) inflate.findViewById(R.id.face_circle_face_light);
        this.mTxtFacePitch = (TextView) inflate.findViewById(R.id.face_circle_face_pitch);
        this.mTxtFaceYaw = (TextView) inflate.findViewById(R.id.face_circle_face_yaw);
        this.mTxtGaussian = (TextView) findViewById(R.id.face_circle_face_gaussian);
        this.mTxtMotion = (TextView) findViewById(R.id.face_circle_face_motion);
        this.mTxtIntegrity = (TextView) findViewById(R.id.face_circle_face_integrity);
        this.mTxtLeftEyeOcclusion = (TextView) findViewById(R.id.face_circle_face_left_eye_occlusion);
        this.mTxtRightEyeOcclusion = (TextView) findViewById(R.id.face_circle_face_right_eye_occlusion);
        this.mTxtDistance = (TextView) findViewById(R.id.face_circle_face_distance);
        this.mTxtRectWidth = (TextView) findViewById(R.id.face_circle_face_rectWidth);
        this.mTxtVersionName = (TextView) findViewById(R.id.smile_version_name);
        this.mTxtCode = (TextView) findViewById(R.id.smile_machine_code);
        this.mTxtVersionName.setText(DeviceUtil.getVersionName(getContext()));
        this.mTxtCode.setText(DeviceUtil.getUtdid(getContext()));
    }

    public void showInfo(AlgorithmInfo algorithmInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bba26e3f", new Object[]{this, algorithmInfo});
        } else if (algorithmInfo == null || !algorithmInfo.isHasFace()) {
            this.mTxtHasFace.setText("false");
            this.mTxtFaceID.setText("-1");
            this.mTxtFaceQuality.setText("0");
            this.mTxtLiveScore.setText("0");
            this.mTxtFaceLight.setText("0");
            this.mTxtFacePitch.setText("0");
            this.mTxtFaceYaw.setText("0");
            this.mTxtGaussian.setText("0");
            this.mTxtMotion.setText("0");
            this.mTxtIntegrity.setText("0");
            this.mTxtLeftEyeOcclusion.setText("0");
            this.mTxtRightEyeOcclusion.setText("0");
            this.mTxtDistance.setText("0");
            this.mTxtRectWidth.setText("0");
        } else {
            TextView textView = this.mTxtHasFace;
            textView.setText("" + algorithmInfo.isHasFace());
            TextView textView2 = this.mTxtFaceID;
            textView2.setText("" + algorithmInfo.getFaceId());
            TextView textView3 = this.mTxtFaceQuality;
            textView3.setText("" + algorithmInfo.getQuality());
            TextView textView4 = this.mTxtFaceLight;
            textView4.setText("" + algorithmInfo.getBrightness());
            TextView textView5 = this.mTxtFacePitch;
            textView5.setText("" + algorithmInfo.getPitch());
            TextView textView6 = this.mTxtFaceYaw;
            textView6.setText("" + algorithmInfo.getYaw());
            TextView textView7 = this.mTxtGaussian;
            textView7.setText("" + algorithmInfo.getGaussian());
            TextView textView8 = this.mTxtMotion;
            textView8.setText("" + algorithmInfo.getMotion());
            TextView textView9 = this.mTxtIntegrity;
            textView9.setText("" + algorithmInfo.getIntegrity());
            TextView textView10 = this.mTxtLeftEyeOcclusion;
            textView10.setText("" + algorithmInfo.getLeftEyeBlinkRatio());
            TextView textView11 = this.mTxtRightEyeOcclusion;
            textView11.setText("" + algorithmInfo.getRightEyeBlinkRatio());
            TextView textView12 = this.mTxtDistance;
            textView12.setText("" + ((int) algorithmInfo.getDistance()));
            TextView textView13 = this.mTxtLiveScore;
            textView13.setText("" + algorithmInfo.getDeepLiveness());
        }
    }
}
