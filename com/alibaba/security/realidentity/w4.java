package com.alibaba.security.realidentity;

import android.view.View;
import com.alibaba.security.realidentity.algo.wrapper.entity.detector.ABDetectType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class w4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3594a;

        static {
            int[] iArr = new int[ABDetectType.values().length];
            f3594a = iArr;
            try {
                ABDetectType aBDetectType = ABDetectType.BLINK;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f3594a;
                ABDetectType aBDetectType2 = ABDetectType.BLINK_STILL;
                iArr2[13] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f3594a;
                ABDetectType aBDetectType3 = ABDetectType.MOUTH;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f3594a;
                ABDetectType aBDetectType4 = ABDetectType.MOUTH_STILL;
                iArr4[14] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f3594a;
                ABDetectType aBDetectType5 = ABDetectType.POS_PITCH_UP;
                iArr5[8] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = f3594a;
                ABDetectType aBDetectType6 = ABDetectType.PITCH_STILL;
                iArr6[16] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = f3594a;
                ABDetectType aBDetectType7 = ABDetectType.POS_PITCH_DOWN;
                iArr7[9] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = f3594a;
                ABDetectType aBDetectType8 = ABDetectType.POS_YAW_RIGHT;
                iArr8[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = f3594a;
                ABDetectType aBDetectType9 = ABDetectType.POS_YAW_LEFT;
                iArr9[5] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = f3594a;
                ABDetectType aBDetectType10 = ABDetectType.POS_YAW;
                iArr10[3] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                int[] iArr11 = f3594a;
                ABDetectType aBDetectType11 = ABDetectType.YAW_STILL;
                iArr11[15] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                int[] iArr12 = f3594a;
                ABDetectType aBDetectType12 = ABDetectType.NONE;
                iArr12[0] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static String a(View view, ABDetectType aBDetectType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb220c17", new Object[]{view, aBDetectType});
        }
        if (aBDetectType == null) {
            return "";
        }
        switch (aBDetectType.ordinal()) {
            case 0:
            case 4:
            case 7:
            case 10:
            case 11:
            case 12:
            default:
                return "";
            case 1:
            case 13:
                return view.getResources().getString(R.string.face_detect_action_blink);
            case 2:
            case 14:
                return view.getResources().getString(R.string.face_detect_action_mounth);
            case 3:
            case 15:
                return view.getResources().getString(R.string.face_detect_action_turn_right_or_left);
            case 5:
                return view.getResources().getString(R.string.face_detect_action_turn_left);
            case 6:
                return view.getResources().getString(R.string.face_detect_action_turn_right);
            case 8:
            case 9:
            case 16:
                return view.getResources().getString(R.string.face_detect_action_pitch_down_head);
        }
    }

    public static int a(ABDetectType aBDetectType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5e7835e", new Object[]{aBDetectType})).intValue();
        }
        if (aBDetectType == null) {
            return -1;
        }
        switch (aBDetectType.ordinal()) {
            case 1:
            case 13:
                return R.drawable.rp_face_guide_blink_anim;
            case 2:
            case 14:
                return R.drawable.rp_face_guide_mouth_anim;
            case 3:
            case 5:
            case 6:
            case 15:
                return R.drawable.rp_face_guide_yaw_anim;
            case 4:
            case 7:
            case 10:
            case 11:
            case 12:
            default:
                return -1;
            case 8:
            case 9:
            case 16:
                return R.drawable.rp_face_guide_pitch_anim;
        }
    }
}
