package pl.sda.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Jarek Czaplicki
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Geolocation {

   private String type;
   private List<Double> coordinates;
}
