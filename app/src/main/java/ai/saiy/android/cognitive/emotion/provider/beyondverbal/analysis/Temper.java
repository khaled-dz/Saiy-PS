/*
 * Copyright (c) 2016. Saiy Ltd. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ai.saiy.android.cognitive.emotion.provider.beyondverbal.analysis;

import com.google.gson.annotations.SerializedName;

/**
 * Helper class to serialise the JSON response from Beyond Verbal
 * <p>
 * Created by benrandall76@gmail.com on 10/06/2016.
 */
public class Temper {

    @SerializedName("Mode")
    private final String mode;

    @SerializedName("Mean")
    private final double mean;

    @SerializedName("Value")
    private final double value;

    @SerializedName("Score")
    private final double score;

    @SerializedName("Group")
    private final String group;

    @SerializedName("Summary")
    private final Summary summary;

    public Temper(final String group, final double value, final Summary summary, final double mean, final String mode,
                  final double score) {
        this.group = group;
        this.value = value;
        this.summary = summary;
        this.mean = mean;
        this.mode = mode;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public double getMean() {
        return mean;
    }

    public String getMode() {
        return mode;
    }

    public String getGroup() {
        return group;
    }

    public Summary getSummary() {
        return summary;
    }

    public double getValue() {
        return value;
    }
}
