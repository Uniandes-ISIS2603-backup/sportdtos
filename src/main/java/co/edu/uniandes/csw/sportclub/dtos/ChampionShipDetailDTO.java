/*
The MIT License (MIT)

Copyright (c) 2015 Los Andes University

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package co.edu.uniandes.csw.sportclub.dtos;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import co.edu.uniandes.csw.sportclub.dtos.*;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class ChampionShipDetailDTO extends ChampionShipDTO{


 private List<RecordDTO> records = new ArrayList<>();



 private List<RefereeDTO> referees = new ArrayList<>();



 private List<StadiumDTO> stadiums = new ArrayList<>();



 private List<RefereeDTO> referees2 = new ArrayList<>();



 private List<PrizeDTO> prizes = new ArrayList<>();



public ChampionShipDetailDTO() {
        super();
    }

    public List<RecordDTO> getRecord() {
        return records;
    }
 
    public void setRecord(List<RecordDTO> records) {
        this.records = records;
    }
    public List<RefereeDTO> getReferee() {
        return referees;
    }
 
    public void setReferee(List<RefereeDTO> referees) {
        this.referees = referees;
    }
    public List<StadiumDTO> getStadium() {
        return stadiums;
    }
 
    public void setStadium(List<StadiumDTO> stadiums) {
        this.stadiums = stadiums;
    }
    public List<RefereeDTO> getSecondaryReferee() {
        return referees;
    }
 
    public void setSecondaryReferee(List<RefereeDTO> referees) {
        this.referees = referees;
    }
    public List<PrizeDTO> getPrize() {
        return prizes;
    }
 
    public void setPrize(List<PrizeDTO> prizes) {
        this.prizes = prizes;
    }
}
