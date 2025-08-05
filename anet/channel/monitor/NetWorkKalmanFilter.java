package anet.channel.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class NetWorkKalmanFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "speed.NetWorkKalmanFilter";
    private double Kalman_ek;
    private double Kalman_z;
    private double kalman_Kk;
    private double kalman_Pk;
    private double kalman_Q;
    private double kalman_R;
    private double kalman_Xk;
    private long Kalman_Count = 0;
    private double Kalman_C1 = mto.a.GEO_NOT_SUPPORT;
    private double Kalman_C2 = mto.a.GEO_NOT_SUPPORT;
    private double mcurrentNetWorkSpeed = mto.a.GEO_NOT_SUPPORT;

    static {
        kge.a(1158239094);
    }

    public double addMeasurement(double d, double d2) {
        IpChange ipChange = $ipChange;
        char c = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43a9a290", new Object[]{this, new Double(d), new Double(d2)})).doubleValue();
        }
        double d3 = d / d2;
        if (d3 < 8.0d) {
            if (this.Kalman_Count != 0) {
                return this.mcurrentNetWorkSpeed;
            }
            this.mcurrentNetWorkSpeed = d3;
            return this.mcurrentNetWorkSpeed;
        }
        long j = this.Kalman_Count;
        if (j == 0) {
            this.Kalman_C1 = d3;
            this.kalman_Xk = this.Kalman_C1;
            double d4 = this.kalman_Xk;
            this.kalman_R = d4 * 0.1d;
            this.kalman_Q = 0.02d * d4;
            this.kalman_Pk = 0.1d * d4 * d4;
        } else if (j == 1) {
            this.Kalman_C2 = d3;
            this.kalman_Xk = this.Kalman_C2;
        } else {
            double d5 = this.Kalman_C2;
            double d6 = d3 - d5;
            this.Kalman_C1 = d5;
            this.Kalman_C2 = d3;
            this.Kalman_z = d3 / 0.95d;
            this.Kalman_ek = this.Kalman_z - (this.kalman_Xk * 0.95d);
            double sqrt = Math.sqrt(this.kalman_R);
            double d7 = this.Kalman_ek;
            if (d7 >= 4.0d * sqrt) {
                this.Kalman_ek = (d7 * 0.75d) + (sqrt * 2.0d);
                c = 1;
            } else if (d7 <= (-4.0d) * sqrt) {
                this.Kalman_ek = (sqrt * (-1.0d)) + (d7 * 0.75d);
                c = 2;
            }
            double d8 = this.Kalman_ek;
            this.kalman_R = Math.min(Math.max(Math.abs((this.kalman_R * 1.05d) - ((0.0025d * d8) * d8)), this.kalman_R * 0.8d), this.kalman_R * 1.25d);
            double d9 = this.kalman_Pk;
            this.kalman_Kk = d9 / ((0.9025d * d9) + this.kalman_R);
            this.kalman_Xk = this.kalman_Xk + (1.0526315789473684d * d6) + (this.kalman_Kk * this.Kalman_ek);
            if (c == 1) {
                this.kalman_Xk = Math.min(this.kalman_Xk, this.Kalman_z);
            } else if (c == 2) {
                this.kalman_Xk = Math.max(this.kalman_Xk, this.Kalman_z);
            }
            this.kalman_Pk = (1.0d - (0.95d * this.kalman_Kk)) * (this.kalman_Pk + this.kalman_Q);
        }
        double d10 = this.kalman_Xk;
        if (d10 < mto.a.GEO_NOT_SUPPORT) {
            this.mcurrentNetWorkSpeed = this.Kalman_C2 * 0.7d;
            this.kalman_Xk = this.mcurrentNetWorkSpeed;
        } else {
            this.mcurrentNetWorkSpeed = d10;
        }
        return this.mcurrentNetWorkSpeed;
    }

    public void ResetKalmanParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a85a540", new Object[]{this});
            return;
        }
        this.Kalman_Count = 0L;
        this.mcurrentNetWorkSpeed = mto.a.GEO_NOT_SUPPORT;
    }
}
