package com.example;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dto.LaptopDto;
import com.example.dto.LaptopsDto;
import com.example.dto.LoginDto;
import com.example.dto.TvDto;
import com.example.dto.TvsDto;
import com.example.dto.UpdatePasswordDto;
import com.example.dto.UpdateUserDetailsDto;
import com.example.dto.UserDto;
import com.example.dto.WatchDto;
import com.example.dto.WatchesDto;
import com.example.entity.Laptops;
import com.example.entity.Tv;
import com.example.entity.User;
import com.example.entity.Watches;
import com.example.service.ProductsService;
import com.example.service.UserService;



@SpringBootTest
class ProjectApplicationTests {
@Autowired
private UserService userService;
@Autowired
private ProductsService productsService;



@Test
void saveUser() {
User user=new User();
user.setId(6);
user.setFirstName("ravi");
user.setLastName("kumar");
user.setEmail("ravi12@gmail.com");
user.setPassword("Ravi12345");
userService.saveUser(user);

}
@Test
void saveUserFail() {
User user=new User();
user.setId(6);
user.setFirstName("ravi");
user.setLastName("karthik");
user.setEmail("karthik12@gmail.com");
user.setPassword("Karthik12345");
userService.saveUser(user);

}
@Test
void getUser()
{
userService.getUser();
}
@Test
void updateUser()
{
UpdateUserDetailsDto updateUserDto=new UpdateUserDetailsDto();
updateUserDto.setFirstName("ravisai");
updateUserDto.setLastName("kumar");
updateUserDto.setEmail("ravi12@gmail.com");
userService.updateUser(updateUserDto, 6);

}
@Test
void updateUserFail()
{
UpdateUserDetailsDto updateUserDto=new UpdateUserDetailsDto();
updateUserDto.setFirstName("ravisai");
updateUserDto.setLastName("kumar");
updateUserDto.setEmail("ravi12@gmail.com");
userService.updateUser(updateUserDto, 10);

}
@Test
void saveUsers() {
UserDto user=new UserDto();
user.setId(7);
user.setFirstName("pavi");
user.setLastName("kumar");
user.setEmail("pavi12@gmail.com");
user.setPassword("Pavi12345");
User users=new User(user.getId(),user.getFirstName(),user.getLastName(),user.getEmail(),user.getPassword());
userService.saveUser(users);

}
@Test
void deleteUserFail()
{
userService.delateUser(9);
}
@Test
void deleteUser()
{
userService.delateUser(7);
}
@Test
void verifyLogIn()
{
LoginDto logInDto=new LoginDto();
logInDto.setEmail("ravi12@gmail.com");
logInDto.setPassword("Ravi12345");
userService.verifylogin(logInDto);

}
@Test
void verifyLogInWrongPassword()
{
LoginDto logInDto=new LoginDto();
logInDto.setEmail("ravi12@gmail.com");
logInDto.setPassword("Ravi45");
userService.verifylogin(logInDto);

}
@Test
void verifyLogInWrongUser()
{
LoginDto logInDto=new LoginDto();
logInDto.setEmail("ravi@gmail.com");
logInDto.setPassword("Ravi45");
userService.verifylogin(logInDto);

}
@Test
void updatePassword()
{
UpdatePasswordDto uDto=new UpdatePasswordDto();
uDto.setOldPassword("Ravi12345");
uDto.setNewPassword("Ravi12");
uDto.setConfirmNewPassword("Ravi12");
userService.updateUserPassword(uDto, 6);




}
@Test
void updatePasswordWithWrongPassword()
{
UpdatePasswordDto uDto=new UpdatePasswordDto();
uDto.setOldPassword("Ravi12345");
uDto.setNewPassword("Ravi12");
uDto.setConfirmNewPassword("Ravi12");
userService.updateUserPassword(uDto, 6);




}
@Test
void updatePasswordWithsamePassword()
{
UpdatePasswordDto uDto=new UpdatePasswordDto();
uDto.setOldPassword("Ravi12");
uDto.setNewPassword("Ravi12");
uDto.setConfirmNewPassword("Ravi12");
userService.updateUserPassword(uDto, 6);




}
@Test
void getUserById()
{
userService.getUserById(6);
}



@Test
void saveWatchProduct() {
Watches watch=new Watches();
watch.setId(104);
watch.setBrand("sonata");
watch.setType("analog");
watch.setWaterResistance("Yes");
watch.setPrice(2000);
productsService.saveWatches(watch);

}
@Test
void saveWatchProductUsingDto() {
WatchDto watch=new WatchDto();
watch.setId(105);
watch.setBrand("poomex");
watch.setType("analog");
watch.setWaterResistance("No");
watch.setPrice(1000);
Watches watches=new Watches(watch.getId(),watch.getBrand(),watch.getType(),watch.getWaterResistance(),watch.getPrice());
productsService.saveWatches(watches);

}
@Test
void saveWatchProductFail() {
Watches watch=new Watches();
watch.setId(104);
watch.setBrand("gts");
watch.setType("analog");
watch.setWaterResistance("Yes");
watch.setPrice(1200);
productsService.saveWatches(watch);

}

@Test
void getWatches()
{
productsService.getAllWatches();
}
@Test
void updateWatche()
{
WatchesDto watchDto=new WatchesDto();
watchDto.setBrand("Sonata X pro");
watchDto.setType("Analog");
watchDto.setWaterResistance("Yes");
watchDto.setPrice(2500);
productsService.updateWatch(watchDto, 104);
}

@Test
void saveLaptopProduct() {
Laptops laptop=new Laptops();
laptop.setId(1004);
laptop.setBrand("Asus");
laptop.setOs("Windows");
laptop.setProcessor("i5 10th generation");
laptop.setPrice(60000);
productsService.saveLaptops(laptop);

}
@Test
void saveLaptopProductUsingDto() {
LaptopDto laptopDto=new LaptopDto();
laptopDto.setId(1005);
laptopDto.setBrand("msi");
laptopDto.setOs("Windows");
laptopDto.setProcessor("i5 10th generation");
laptopDto.setPrice(70000);
Laptops laptop=new Laptops(laptopDto.getId(),laptopDto.getBrand(),laptopDto.getOs(),laptopDto.getProcessor(),laptopDto.getPrice());
productsService.saveLaptops(laptop);

}
@Test
void getLaptops()
{
productsService.getAllLaptops();
}
@Test
void updateLaptop()
{
LaptopsDto laptopDto=new LaptopsDto();
laptopDto.setBrand("Asus");
laptopDto.setOs("Windows");
laptopDto.setProcessor("i5 11th generation");
laptopDto.setPrice(65000);
productsService.updateLaptops(laptopDto, 1004);
}

@Test
void saveTvProduct() {
Tv tv=new Tv();
tv.setId(10004);
tv.setBrand("One plus");
tv.setDisplaySize("32 inches");
tv.setDisplayType("Led");
tv.setPrice(25000);
productsService.saveTvs(tv);

}
@Test
void saveTvProductFail() {
Tv tv=new Tv();
tv.setId(10004);
tv.setBrand("One plus");
tv.setDisplaySize("32 inches");
tv.setDisplayType("Led");
tv.setPrice(25000);
productsService.saveTvs(tv);

}
@Test
void saveTvProductUsingDto() {
TvsDto tvDto=new TvsDto();
tvDto.setId(10005);
tvDto.setBrand("samsung xpro");
tvDto.setDisplaySize("72 inches");
tvDto.setDisplayType("Led");
tvDto.setPrice(75000);
Tv tvs=new Tv(tvDto.getId(),tvDto.getBrand(),tvDto.getDisplayType(),tvDto.getDisplaySize(),tvDto.getPrice());



productsService.saveTvs(tvs);

}
@Test
void getTvs()
{
productsService.getAllTvs();
}
@Test
void updateTvDetails()
{
TvDto tvDto=new TvDto();
tvDto.setBrand("One plus");
tvDto.setDisplayType("Lcd");
tvDto.setDisplaySize("32 inches");
tvDto.setPrice(22000);
productsService.updateTvs(tvDto, 10004);
}
@Test
void updateTvDetailsFail()
{
TvDto tvDto=new TvDto();
tvDto.setBrand("One plus pro");
tvDto.setDisplayType("Lcd");
tvDto.setDisplaySize("52 inches");
tvDto.setPrice(32000);
productsService.updateTvs(tvDto, 1119);
}

@Test
void deleteTv()
{
productsService.delateTvs(10004);
}
@Test
void deleteTvFail()
{
productsService.delateTvs(100004);
}
@Test
void deleteLaptop()
{
productsService.delateLaptops(1004);
}
@Test
void deleteLaptopFail()
{
productsService.delateLaptops(1009);
}

@Test
void deleteWatch()
{
productsService.delateWatch(105);
}
@Test
void deleteWatchFail()
{
productsService.delateWatch(111);
}








}