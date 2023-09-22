package com.example.modoocommonsense.cardstackview.internal;

import android.view.animation.Interpolator;
import com.example.modoocommonsense.cardstackview.*;

public interface AnimationSetting {
    Direction getDirection();
    int getDuration();
    Interpolator getInterpolator();
}
